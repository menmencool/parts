package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

/**
 * describe:
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
 /*   public void groupbyData() {
        UrlBean urlBean = new UrlBean();
        urlBean.setBrandname(TestData.NAME);

        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.PARTSBYIDS_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBeans detailsBeans = gson.fromJson(response.body().toString(),
                                DetailsBeans.class);
                        List<DetailsBeans.DataDicBean.MatchPartsBean> matchParts = detailsBeans
                                .getDataDic().getMatchParts();
                        //热门配件
                        DetailsAdapters adapter = new DetailsAdapters(R.layout.accessories_adapter,
                                matchParts);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_groupby_list.setAdapter(adapter);
                     *//*   adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
                     () {
                            @Override
                            public void onItemClick(BaseQuickAdapter adapter, View view, int
                            position) {
                                String pkgId = result.get(position).getTestPkgId();
                                Intent intent = new Intent(context, PkgIdActivity.class);
                                intent.putExtra("id", pkgId);
                                context.startActivity(intent);
                            }
                        });*//*
                    }
                });
    }*/
}
