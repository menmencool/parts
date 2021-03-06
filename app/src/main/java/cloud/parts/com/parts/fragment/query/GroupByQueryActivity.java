package cloud.parts.com.parts.fragment.query;

import android.content.Intent;
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
import com.orhanobut.logger.Logger;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.adapter.GroupByQueryAdapter;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * describe:分组清单
 * date:2017/12/25
 * author:zhuang
 */

public class GroupByQueryActivity extends BaseActivity {

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
        include_title_zhong.setText("分组清单");
        include_title_zhong.setOnClickListener(this);
        rl_groupby_list = (RecyclerView) findViewById(R.id.rl_groupby_list);
        rl_groupby_list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        byQueryData();
    }

    //单个配件查询分组
    public void byQueryData() {
        final String modelPk = getIntent().getStringExtra("modelPk");
        final String brandName = getIntent().getStringExtra("brandName");
        Logger.e(modelPk+brandName+"-----------------");
        UrlBean urlBean = new UrlBean();
        urlBean.setModelPk(modelPk);
        urlBean.setBrandName(brandName);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        String token = UserCentre.getInstance().getToken();
        OkGo.<String>post(CarUrl.QATG_URL)
                .tag(this)
                .headers("authtoken", token)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        GroupByQueryBean groupbyquerybean = gson.fromJson(response.body().toString(),
                                GroupByQueryBean.class);
                        final List<GroupByQueryBean.DataDicBean.ListBean> listBeans = groupbyquerybean.getDataDic().getList();
                        GroupByQueryAdapter adapter = new GroupByQueryAdapter(R.layout
                                .group_by_query_adapter, listBeans);
                        rl_groupby_list.setAdapter(adapter);

                            adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                                    Intent intent = new Intent(GroupByQueryActivity.this,
                                            GroupByQueryHollesiActivity.class);
                                    intent.putExtra("modelPk",modelPk);
                                    intent.putExtra("brandName",brandName);
                                    intent.putExtra("topGroupId",listBeans.get(position).getGroup_id());
                                    intent.putParcelableArrayListExtra("subGroups",listBeans.get(position).getSubGroups());
                                    startActivity(intent);
                                }
                            });

                      /*
                            adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
                                @Override
                                public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}
