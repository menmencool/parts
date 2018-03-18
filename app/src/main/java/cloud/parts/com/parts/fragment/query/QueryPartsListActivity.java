package cloud.parts.com.parts.fragment.query;

import android.content.Intent;
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
import com.orhanobut.logger.Logger;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.adapter.GroupByQueryAdapter;
import cloud.parts.com.parts.fragment.query.adapter.QueryPartsListAdaptre;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;
import cloud.parts.com.parts.fragment.query.bean.QueryPartsListBean;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.web.WebViewShow;

/**
 * ===================================
 * describe:
 * date:2018/3/13
 * author:zhuang
 * ===================================
 */

public class QueryPartsListActivity extends BaseActivity {
    private ImageView include_banck;
    private TextView include_title_zhong;
    private RecyclerView rl_querypartslist_list;


    @Override
    protected void initView() {
        setContentView(R.layout.querypartslist_activity);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_title_zhong = (TextView) findViewById(R.id.include_title_zhong);
        include_title_zhong.setVisibility(View.VISIBLE);
        include_title_zhong.setText("配件清单");
        include_title_zhong.setOnClickListener(this);
        rl_querypartslist_list = (RecyclerView) findViewById(R.id.rl_querypartslist_list);
        rl_querypartslist_list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        byQueryData();
    }

    //查询图组中的配件
    public void byQueryData() {
        String modelPk = getIntent().getStringExtra("modelPk");
        String brandName = getIntent().getStringExtra("brandName");
        String topGroupId = getIntent().getStringExtra("topGroupId");
        String subGroupId = getIntent().getStringExtra("subGroupId");
        String graphGroupId = getIntent().getStringExtra("graphGroupId");
        UrlBean urlBean = new UrlBean();
        urlBean.setAction("2");
        urlBean.setModelPk(modelPk);
        urlBean.setBrandName(brandName);
        urlBean.setTopGroupId(topGroupId);
        urlBean.setSubGroupId(subGroupId);
        urlBean.setGraphGroupId(graphGroupId);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        String token = UserCentre.getInstance().getToken();
        OkGo.<String>post(CarUrl.QUERYPARTSLIST_URL)
                .tag(this)
                .headers("authtoken", token)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        QueryPartsListBean querypartslistbean = gson.fromJson(response.body()
                                        .toString(),
                                QueryPartsListBean.class);
                        final List<QueryPartsListBean.DataDicBean.ListBean> listBeans =
                                querypartslistbean.getDataDic().getList();
                        QueryPartsListAdaptre adapter = new QueryPartsListAdaptre(R.layout
                                .querypartslist_adapter, listBeans);
                        rl_querypartslist_list.setAdapter(adapter);
                        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(BaseQuickAdapter adapter, View view, int
                                    position) {
                                Intent intent = new Intent(QueryPartsListActivity.this,
                                        WebViewShow.class);
                                intent.putExtra("url", CarUrl.WEBURL + listBeans.get(position)
                                        .getPart_code());
                                intent.putExtra("type", "1");
                                startActivity(intent);
                            }
                        });

                      /*
                            adapter.setOnItemChildClickListener(new BaseQuickAdapter
                            .OnItemChildClickListener() {
                                @Override
                                public void onItemChildClick(BaseQuickAdapter adapter, View view,
                                 int position) {
                                    switch (view.getId()) {
                                        case R.id.tv_vinquery_by:

                                            break;
                                    }
                                }
                            });*/

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
}
