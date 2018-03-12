package cloud.parts.com.parts.fragment.query;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.adapter.GroupByQueryAdapter;
import cloud.parts.com.parts.fragment.query.adapter.PartsListAdapter;
import cloud.parts.com.parts.fragment.query.adapter.QueryByBrandnameAdapter;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;
import cloud.parts.com.parts.fragment.query.bean.QueryByBrandnameBean;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * describe:配件清单
 * date:2017/12/25
 * author:zhuang
 */

public class PartsListActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_title_zhong;
    private RecyclerView rl_groupby_list;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_groupbyquery);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_title_zhong = (TextView) findViewById(R.id.include_title_zhong);
        include_title_zhong.setVisibility(View.VISIBLE);
        include_title_zhong.setText("配件清单");
        include_title_zhong.setOnClickListener(this);
        rl_groupby_list = (RecyclerView) findViewById(R.id.rl_groupby_list);
        rl_groupby_list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        ArrayList<GroupByQueryBean.DataDicBean.ListBean.SubGroupsBean> subGroups =
                getIntent().getParcelableArrayListExtra("subGroups");
        PartsListAdapter adapter = new PartsListAdapter(R.layout
                .group_by_query_adapter, subGroups);
        rl_groupby_list.setAdapter(adapter);
    }

    @Override
    protected void initListener() {
        include_banck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}
