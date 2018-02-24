package cloud.parts.com.parts.fragment.query;

import android.app.Activity;
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

import com.baidu.ocr.ui.camera.CameraActivity;
import com.bigkoo.alertview.AlertView;
import com.bigkoo.alertview.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.orhanobut.logger.Logger;

import org.litepal.crud.DataSupport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.activity.MainActivity;
import cloud.parts.com.parts.db.DBDataBean;
import cloud.parts.com.parts.fragment.query.adapter.DetailsAdapter;
import cloud.parts.com.parts.fragment.query.adapter.DetailsAdapters;
import cloud.parts.com.parts.fragment.query.adapter.ErrorAdapter;
import cloud.parts.com.parts.fragment.query.bean.DetailsBean;
import cloud.parts.com.parts.fragment.query.bean.DetailsBeans;
import cloud.parts.com.parts.ocr.FileUtil;
import cloud.parts.com.parts.ocr.RecognizeService;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * 类用途：点击查询Vin号的详情页面
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
    private ImageView iv_details_top;
    private TextView tv_yishibie;
    private TextView tv_weishibie;
    private static final int REQUEST_CODE_VEHICLE_LICENSE = 120;
    private List<DetailsBeans.DataDicBean.MatchPartsBean> mMatchParts;

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
        rl_details_noaccessories.setNestedScrollingEnabled(false);
        et_home_vinnumber = (EditText) findViewById(R.id.et_home_vinnumber);
        iv_home_scancode = (ImageView) findViewById(R.id.iv_home_scancode);
        iv_home_scancode.setOnClickListener(this);
        //展示test
        iv_details_top = (ImageView) findViewById(R.id.iv_details_top);

        tv_yishibie = (TextView) findViewById(R.id.tv_yishibie);
        tv_weishibie = (TextView) findViewById(R.id.tv_weishibie);
    }

    @Override
    protected void initData() {
        //存储返回成功的内容
        mDataBean = new DBDataBean();
        //查询
        mQueryall = DataSupport.findAll(DBDataBean.class);
        hotpartsData();

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
                        Glide.with(DetailsActivity.this).load(dataDic.getModel().getImgurl())
                                .into(iv_details_top);
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

    //批量查询数据
    public void accessoriesData() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1090027482");
        strings.add("1090031747");
        strings.add("1090032337");
        strings.add("11111111111111");
        strings.add("11111111111111");
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

                    private List<String> mErrorParts;
                    private DetailsAdapters mMatchadapter;


                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBeans detailsBeans = gson.fromJson(response.body().toString(),
                                DetailsBeans.class);
                        mMatchParts = detailsBeans.getDataDic().getMatchParts();
                        //已识别配件
                        if (!mMatchParts.isEmpty()) {
                            tv_yishibie.setVisibility(View.VISIBLE);
                        }

                        mMatchadapter = new DetailsAdapters(R.layout.accessories_adapter,
                                mMatchParts);
                        mMatchadapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_accessories.setAdapter(mMatchadapter);
                        mErrorParts = detailsBeans.getDataDic().getErrorParts();
                        //未识别配件
                        if (!mErrorParts.isEmpty()) {
                            tv_weishibie.setVisibility(View.VISIBLE);
                        }

                        ErrorAdapter erroradapter = new ErrorAdapter(R.layout.error_adapter,
                                mErrorParts);
                        erroradapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_details_noaccessories.setAdapter(erroradapter);

                        mMatchadapter.setOnItemChildClickListener(new BaseQuickAdapter
                                .OnItemChildClickListener() {
                            @Override
                            public void onItemChildClick(BaseQuickAdapter adapter, View view, int
                                    position) {
                                switch (view.getId()) {
                                    case R.id.tv_vinquery_by:
                                        Intent intent = new Intent(DetailsActivity.this,
                                                PartsListActivity.class);
                                        intent.putExtra("grouppk", "1");
                                        intent.putExtra("brandname", "宝马");
                                        startActivity(intent);
                                        break;
                                    case R.id.tv_vinquery_delete:
                                        mMatchParts.remove(position);
                                        mMatchadapter.notifyDataSetChanged();
                                        if (mMatchParts.size() == 0) {
                                            tv_yishibie.setVisibility(View.GONE);
                                        }
                                        break;

                                }
                            }
                        });

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
                    if (!MainActivity.hasGotToken) {
                        Toast.makeText(DetailsActivity.this, "Token值未获取", Toast.LENGTH_SHORT)
                                .show();
                        return;
                    }
                    Intent intent = new Intent(DetailsActivity.this, CameraActivity.class);
                    intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,
                            FileUtil.getSaveFile(DetailsActivity.this.getApplication())
                                    .getAbsolutePath());
                    intent.putExtra(CameraActivity.KEY_CONTENT_TYPE,
                            CameraActivity.CONTENT_TYPE_GENERAL);
                    startActivityForResult(intent, REQUEST_CODE_VEHICLE_LICENSE);

                    //批量查询数据
                    accessoriesData();
                } else if (position == 1) {
                    submit();

                }
            }
        }).show();
    }

    /**
     * OCR识别返回的结果
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 识别成功回调，行驶证识别
        if (requestCode == REQUEST_CODE_VEHICLE_LICENSE && resultCode == Activity.RESULT_OK) {
            RecognizeService.recVehicleLicense(FileUtil.getSaveFile(DetailsActivity.this
                            .getApplicationContext()).getAbsolutePath(),
                    new RecognizeService.ServiceListener() {
                        @Override
                        public void onResult(String result) {
                            //infoPopText(result);
                            Logger.e(result.toString());
                            Toast.makeText(DetailsActivity.this, result.toString(), Toast
                                    .LENGTH_SHORT).show();
                        }
                    });
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //直接搜索
    private void submit() {
        // validate
        String vinnumber = et_home_vinnumber.getText().toString().trim();
        if (TextUtils.isEmpty(vinnumber)) {
            Toast.makeText(this, "输入配件编号...", Toast.LENGTH_SHORT).show();
            return;
            //批量查询数据
        }
        accessoriesData();
        et_home_vinnumber.setText("");
        }
}
