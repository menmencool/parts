package cloud.parts.com.parts.fragment.query;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.adapter.GroupByQueryHollesIdiAdapter;
import cloud.parts.com.parts.fragment.query.adapter.PartsListAdapter;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;

/**
 * describe:配件清单
 * date:2017/12/25
 * author:zhuang
 */

public class GroupByQueryHollesIdiActivity extends BaseActivity {

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
        ArrayList<GroupByQueryBean.DataDicBean.ListBean.SubGroupsBean.GraphGroupsBean> graphGroups =
                getIntent().getParcelableArrayListExtra("graphGroups");
        GroupByQueryHollesIdiAdapter adapter = new GroupByQueryHollesIdiAdapter(R.layout
                .group_by_query_adapter, graphGroups);
        rl_groupby_list.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            /*    Intent intent = new Intent(PartsListActivity.this,
                        PartsListActivity.class);
                intent.putParcelableArrayListExtra("subGroups",listBeans.get(position).getSubGroups());
                startActivity(intent);*/
            }
        });
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
