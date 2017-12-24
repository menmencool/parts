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

import java.util.ArrayList;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.DetailsAdapter;
import cloud.parts.com.parts.fragment.home.adapter.DetailsAdapters;
import cloud.parts.com.parts.fragment.home.bean.DetailsBean;
import cloud.parts.com.parts.fragment.home.bean.DetailsBeans;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/24 10:49
 */

public class DetailsActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_mes;
    private RecyclerView rl_details_accessories;
    private RecyclerView rl_details_hotparts;
    private TextView tv_details_carname;
    private TextView tv_details_brand;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_details);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_mes = (TextView) findViewById(R.id.include_mes);
        include_mes.setVisibility(View.VISIBLE);
        include_mes.setText("分组查询");
        include_mes.setOnClickListener(this);
        rl_details_accessories = (RecyclerView) findViewById(R.id.rl_details_accessories);//识别配件
        rl_details_hotparts = (RecyclerView) findViewById(R.id.rl_details_hotparts);//热门配件
        tv_details_carname = (TextView) findViewById(R.id.tv_details_carname);
        tv_details_brand = (TextView) findViewById(R.id.tv_details_brand);
        rl_details_hotparts.setNestedScrollingEnabled(false);
        rl_details_accessories.setNestedScrollingEnabled(false);
        rl_details_accessories.setLayoutManager(new LinearLayoutManager(this));
        rl_details_hotparts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        hotpartsData();
        accessoriesData();
    }

    //热门配件
    public void hotpartsData() {
        UrlBean urlBean = new UrlBean();
        urlBean.setVin(TestData.VIN);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.VIN_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBean vinQueryBean = gson.fromJson(response.body().toString(),
                                DetailsBean.class);
                        DetailsBean.DataDicBean dataDic = vinQueryBean.getDataDic();
                        tv_details_carname.setText(dataDic.getModel().getPpmc());
                        tv_details_brand.setText(dataDic.getModel().getCxmc2());
                        //热门配件
                        List<DetailsBean.DataDicBean.HotpartsBean> hotparts = dataDic.getHotparts();
                        DetailsAdapter adapter = new DetailsAdapter(R.layout.vinquery_adapter,
                                hotparts);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_hotparts.setAdapter(adapter);
                     /*   adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
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

    public void accessoriesData() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1090027482");
        strings.add("1090031747");
        strings.add("1090032337");
        strings.add("11111111111111");
        UrlBean urlBean = new UrlBean();
        urlBean.setIds(strings);
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
                        DetailsAdapters adapter = new DetailsAdapters(R.layout.vinquery_adapter,
                                matchParts);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_accessories.setAdapter(adapter);
                     /*   adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
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
    }
}
