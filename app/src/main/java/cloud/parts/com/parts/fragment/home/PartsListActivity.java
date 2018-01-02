package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
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

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.QueryByBrandnameAdapter;
import cloud.parts.com.parts.fragment.home.bean.QueryByBrandnameBean;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * describe:
 * date:2017/12/25
 * author:zhuang
 */

public class PartsListActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_title_zhong;
    private RecyclerView rl_groupby_list;
    private TextView tv;

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
        tv = (TextView) findViewById(R.id.tv);
        tv.setVisibility(View.GONE);
    }

    @Override
    protected void initData() {
        String grouppk = getIntent().getStringExtra("grouppk");
        String brandname = getIntent().getStringExtra("brandname");
        groupbyData(grouppk, brandname);
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

    public void groupbyData(String by, String name) {
        UrlBean urlBean = new UrlBean();
        urlBean.setGrouppk(by);
        urlBean.setBrandname(name);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.BRANDNAME_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        QueryByBrandnameBean brandnameBean =
                                gson.fromJson(response.body().toString(),
                                        QueryByBrandnameBean.class);
                        List<QueryByBrandnameBean.DataDicBean.MatchPartsBean>
                                matchParts = brandnameBean.getDataDic().getMatchParts();
                        //配件清单
                        QueryByBrandnameAdapter adapter = new QueryByBrandnameAdapter(R.layout
                                .querybybradname_adapter,
                                matchParts);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_groupby_list.setAdapter(adapter);
                        /*adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
                                () {
                            @Override
                            public void onItemClick(BaseQuickAdapter adapter, View view, int
                                    position) {
                                String pkgId = result.get(position).getTestPkgId();
                                Intent intent = new Intent(context, PkgIdActivity.class);
                                intent.putExtra("id", pkgId);
                                context.startActivity(intent);
                            }
                        });*/
                    }
                });
    }
}
