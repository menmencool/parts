package cloud.parts.com.parts.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.alertview.AlertView;
import com.bigkoo.alertview.OnItemClickListener;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import org.litepal.crud.DataSupport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.db.DBDataBean;
import cloud.parts.com.parts.fragment.home.adapter.DetailsAdapter;
import cloud.parts.com.parts.fragment.home.adapter.DetailsAdapters;
import cloud.parts.com.parts.fragment.home.adapter.ErrorAdapter;
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
    private EditText et_home_vinnumber;
    private ImageView iv_home_scancode;
    private DBDataBean mDataBean;
    private List<DBDataBean> mQueryall;
    private RecyclerView rl_details_noaccessories;

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
        rl_details_noaccessories = (RecyclerView) findViewById(R.id.rl_details_noaccessories);
        rl_details_hotparts = (RecyclerView) findViewById(R.id.rl_details_hotparts);//热门配件
        tv_details_carname = (TextView) findViewById(R.id.tv_details_carname);
        tv_details_brand = (TextView) findViewById(R.id.tv_details_brand);
        rl_details_accessories.setLayoutManager(new LinearLayoutManager(this));
        rl_details_hotparts.setLayoutManager(new LinearLayoutManager(this));
        rl_details_noaccessories.setLayoutManager(new LinearLayoutManager(this));
        rl_details_hotparts.setNestedScrollingEnabled(false);
        rl_details_accessories.setNestedScrollingEnabled(false);
        rl_details_hotparts.setNestedScrollingEnabled(false);
        rl_details_noaccessories.setNestedScrollingEnabled(false);
        et_home_vinnumber = (EditText) findViewById(R.id.et_home_vinnumber);
        iv_home_scancode = (ImageView) findViewById(R.id.iv_home_scancode);
        iv_home_scancode.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        //存储返回成功的内容
        mDataBean = new DBDataBean();
        //查询
        mQueryall = DataSupport.findAll(DBDataBean.class);


        hotpartsData();
        accessoriesData();
    }

    //热门配件
    public void hotpartsData() {
        String vin = getIntent().getStringExtra("VIN");
        UrlBean urlBean = new UrlBean();
        urlBean.setVin(vin);
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
                        //获取当前时间
                        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String date = sDateFormat.format(new Date());
                        if (mQueryall.size() != 0) {
                            for (int i = 0; i < mQueryall.size(); i++) {
                                if (mQueryall.get(i).getVincode().equals(dataDic.getVincode())) {
                                    mDataBean.setTime(date);
                                    mDataBean.updateAll("vincode=?", dataDic.getVincode());
                                } else {
                                    //存入信息
                                    mDataBean.setVincode(dataDic.getVincode());
                                    mDataBean.setCxmc2(dataDic.getModel().getCxmc2());
                                    mDataBean.setTime(date);
                                    mDataBean.save();
                                }
                            }
                        } else {
                            //存入信息
                            mDataBean.setVincode(dataDic.getVincode());
                            mDataBean.setCxmc2(dataDic.getModel().getCxmc2());
                            mDataBean.setTime(date);
                            mDataBean.save();
                        }

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
                        //已识别配件
                        List<DetailsBeans.DataDicBean.MatchPartsBean> matchParts = detailsBeans
                                .getDataDic().getMatchParts();
                        DetailsAdapters matchadapter = new DetailsAdapters(R.layout.accessories_adapter,
                                matchParts);
                        matchadapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_accessories.setAdapter(matchadapter);
                        //未识别配件
                        List<String> errorParts = detailsBeans.getDataDic().getErrorParts();
                        ErrorAdapter erroradapter = new ErrorAdapter(R.layout.error_adapter,
                                errorParts);
                        erroradapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_noaccessories.setAdapter(erroradapter);



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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.include_banck:
                finish();
                break;
            case R.id.include_mes:
                startActivity(new Intent(this, GroupByQueryActivity.class));
                break;
            case R.id.iv_home_scancode:
                alertShow();
                break;
        }
    }

    public void alertShow() {
        new AlertView("选择搜索方式", null, "取消", null,
                new String[]{"批量扫描", "直接搜索"},
                this, AlertView.Style.ActionSheet, new OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                if (position == 0) {
              /*      if (!checkTokenStatus()) {
                        return;
                    }
                    Intent intent = new Intent(getActivity(), CameraActivity.class);
                    intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,
                            FileUtil.getSaveFile(getActivity().getApplication()).getAbsolutePath());
                    intent.putExtra(CameraActivity.KEY_CONTENT_TYPE,
                            CameraActivity.CONTENT_TYPE_GENERAL);
                    startActivityForResult(intent, REQUEST_CODE_VEHICLE_LICENSE);*/
                } else if (position == 1) {
                    submit();

                }
            }
        }).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void submit() {
        // validate
        String vinnumber = et_home_vinnumber.getText().toString().trim();
        if (TextUtils.isEmpty(vinnumber)) {
            Toast.makeText(this, "输入配件编号...", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
