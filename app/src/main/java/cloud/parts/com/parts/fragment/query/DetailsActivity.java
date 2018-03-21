package cloud.parts.com.parts.fragment.query;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
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

import java.util.ArrayList;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.adapter.QueryIVeiemAdapter;
import cloud.parts.com.parts.fragment.query.bean.DetailsBean;
import cloud.parts.com.parts.fragment.query.bean.DetailsBeans;
import cloud.parts.com.parts.fragment.query.bean.QueryIVetemBean;
import cloud.parts.com.parts.init.PartsApp;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.ocr.FileUtil;
import cloud.parts.com.parts.ocr.RecognizeService;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.web.WebViewShow;

/**
 * 类用途：点击查询Vin号的详情页面
 * 作者：Zhuang
 * 时间：2017/12/24 10:49
 */

public class DetailsActivity extends BaseActivity implements View.OnClickListener {

    private ImageView include_banck;
    private TextView include_mes;
    private TextView tv_details_carname;
    private TextView tv_details_brand;
    private EditText et_home_vinnumber;
    private ImageView iv_home_scancode;
    private ImageView iv_details_top;
    private static final int REQUEST_CODE_VEHICLE_LICENSE = 120;
    private RecyclerView rl_details_queryiveiem;
    private ArrayList<String> codingList = new ArrayList<>();
    private DetailsBean.DataDicBean dataDic;
    private Button bt_details_xiangqing;
    ArrayList<DetailsBeans.DataDicBean.ListBean> partListAll = new ArrayList<>();
    private QueryIVeiemAdapter mAdapter;
    private QueryIVetemBean quryIvetemBean;
    private ImageView iv_details_add;

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
        rl_details_queryiveiem = (RecyclerView) findViewById(R.id.rl_details_queryiveiem);//查询历史
        tv_details_carname = (TextView) findViewById(R.id.tv_details_carname);
        tv_details_brand = (TextView) findViewById(R.id.tv_details_brand);
        rl_details_queryiveiem.setLayoutManager(new LinearLayoutManager(this));
        rl_details_queryiveiem.setNestedScrollingEnabled(false);
        et_home_vinnumber = (EditText) findViewById(R.id.et_home_vinnumber);
        iv_home_scancode = (ImageView) findViewById(R.id.iv_home_scancode);
        iv_home_scancode.setOnClickListener(this);
        //展示test
        iv_details_top = (ImageView) findViewById(R.id.iv_details_top);
        bt_details_xiangqing = (Button) findViewById(R.id.bt_details_xiangqing);
        bt_details_xiangqing.setOnClickListener(this);
        iv_details_add = (ImageView) findViewById(R.id.iv_details_add);
        iv_details_add.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        String vin = getIntent().getStringExtra("VIN");
        hotpartsData(vin);
        queryData(vin);
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
                Intent intent = new Intent(this, GroupByQueryActivity.class);
                if (!dataDic.getModel().getModel_pk().equals("") && dataDic.getModel()
                        .getModel_pk() != null) {
                    intent.putExtra("modelPk", dataDic.getModel().getModel_pk());
                    intent.putExtra("brandName", dataDic.getModel().getBrand_name());
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "资料尚未完善", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.iv_home_scancode:
                alertShow();
                InputMethodManager imm = (InputMethodManager)
                        getSystemService(this.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                break;
            case R.id.bt_details_xiangqing:
                Intent intents = new Intent(this, WebViewShow.class);
                intents.putExtra("url", CarUrl.DISPLAYMODELBY_URL + dataDic.getVincode());
                intents.putExtra("type", "1");
                startActivity(intents);
                break;
            case R.id.iv_details_add:
                ordersShow();
                break;
        }
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
                            //牌照输入查询
                            codingList.add(result.toString());
                            accessoriesData(codingList);
                        }
                    });
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //搜索选择框
    public void alertShow() {
        new AlertView("选择搜索方式", null, "取消", null,
                new String[]{"批量扫描", "直接搜索"},
                this, AlertView.Style.ActionSheet, new OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                if (position == 0) {
                    if (!PartsApp.hasGotToken) {
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
                    //批量查询数据accessoriesData();
                } else if (position == 1) {
                    submit();

                }
            }
        }).show();
    }

    //提示框
    public void promptShow(String conent) {
        new AlertView("提示", conent, null, new String[]{"确定"}, null, this,
                AlertView.Style.Alert, new OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                if (position == 0) {
                    finish();
                }
            }
        }).show();
    }

    //订单报价单选择框
    public void ordersShow() {
        new AlertView("选择搜索方式", null, "取消", null,
                new String[]{"订单查询", "报价单查询"},
                this, AlertView.Style.ActionSheet, new OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                if (position == 0) {

                } else if (position == 1) {

                }
            }
        }).show();
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
        //手动输入查询
        codingList.add(vinnumber);
        accessoriesData(codingList);
        et_home_vinnumber.setText("");
    }

    //热门配件
    public void hotpartsData(String vinCode) {
        UrlBean urlBean = new UrlBean();
        urlBean.setVin(vinCode);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        String token = UserCentre.getInstance().getToken();
        OkGo.<String>post(CarUrl.VIN_URL)
                .tag(this)
                .headers("authtoken", token)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBean vinQueryBean = gson.fromJson(response.body().toString(),
                                DetailsBean.class);
                        String status = vinQueryBean.getStatus();
                        if (status.equals("0")) {
                            dataDic = vinQueryBean.getDataDic();
                            tv_details_carname.setText(dataDic.getModel().getPpmc());
                            tv_details_brand.setText(dataDic.getModel().getCxmc());
                            Glide.with(DetailsActivity.this).load(dataDic.getModel().getImgurl())
                                    .centerCrop().into(iv_details_top);
                        } else {
                           /* Toast.makeText(DetailsActivity.this, vinQueryBean.getErrmsg(), Toast
                                    .LENGTH_LONG).show();*/
                            promptShow(vinQueryBean.getErrmsg());
                        }
                    }
                });
    }

    //单个配件查询历史
    public void queryData(String vinCode) {
        UrlBean urlBean = new UrlBean();
        urlBean.setVin(vinCode);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        String token = UserCentre.getInstance().getToken();
        OkGo.<String>post(CarUrl.QUERY_URL)
                .tag(this)
                .headers("authtoken", token)
                .upJson(s)
                .execute(new StringCallback() {


                    @Override
                    public void onSuccess(Response<String> response) {
                        quryIvetemBean = gson.fromJson(response.body().toString(),
                                QueryIVetemBean.class);
                        ArrayList<DetailsBeans.DataDicBean.ListBean> partList =
                                quryIvetemBean.getDataDic().getPartList();
                        partListAll.addAll(partList);
                        mAdapter = new QueryIVeiemAdapter(R.layout
                                .queryivetem_adapter,
                                partListAll);
                        rl_details_queryiveiem.setAdapter(mAdapter);
                        mAdapter.setOnItemChildClickListener(new BaseQuickAdapter
                                .OnItemChildClickListener() {
                            @Override
                            public void onItemChildClick(BaseQuickAdapter adapter, View view, int
                                    position) {
                                switch (view.getId()) {
                                    case R.id.tv_vinquery_by:
                                        Intent intent = new Intent(DetailsActivity.this,
                                                WebViewShow.class);
                                        intent.putExtra("url", CarUrl.WEBURL + partListAll.get
                                                (position).getPart_code());
                                        intent.putExtra("type", "1");
                                        startActivity(intent);
                                        break;
                                    case R.id.tv_vinquery_delete:
                                        partListAll.remove(position);
                                        adapter.notifyDataSetChanged();
                                        //更新接口
                                        upHistoryData(quryIvetemBean.getDataDic().getHistoryId(),
                                                quryIvetemBean.getDataDic().getVincode());
                                        break;
                                }
                            }
                        });
                    }
                });
    }

    //批量查询数据
    public void accessoriesData(ArrayList<String> codingLists) {
        //反转控制
        //Collections.reverse(codingLists);
        UrlBean urlBean = new UrlBean();
        urlBean.setIds(codingLists);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.QUERYPARTSBYI0DS_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {

                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBeans detailsBeans = gson.fromJson(response.body().toString(),
                                DetailsBeans.class);
                        final List<DetailsBeans.DataDicBean.ListBean> listBeans = detailsBeans
                                .getDataDic().getList();

                        DetailsBeans.DataDicBean.ListBean one;
                        DetailsBeans.DataDicBean.ListBean two;
                        String code;
                        boolean f = false;
                        for (int i = 0; i < listBeans.size(); i++) {
                            f = false;
                            one = listBeans.get(i);
                            code = one.getPart_code();
                            Logger.e("这是搜索回来的" + code);
                            for (int j = 0; j < partListAll.size(); j++) {
                                two = partListAll.get(j);
                                Logger.e("这是原来集合的" + two.getPart_code());
                                if (code.equals(two.getPart_code())) {
                                    partListAll.remove(j);
                                    partListAll.add(0, one);
                                    f = true;
                                    break;
                                }
                            }
                            if (!f) {
                                partListAll.add(0, one);
                            }

                        }
                        mAdapter.notifyDataSetChanged();
                        //更新接口
                        upHistoryData(quryIvetemBean.getDataDic().getHistoryId(),
                                quryIvetemBean.getDataDic().getVincode());

                    }

                });
    }

    //更新历史报价单
    public void upHistoryData(String histryid, String vincode) {
        UrlBean urlBean = new UrlBean();
        urlBean.setAction("1");
        urlBean.setHistoryId(histryid);
        urlBean.setVin(vincode);
        urlBean.setPartsList(partListAll);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        String token = UserCentre.getInstance().getToken();
        OkGo.<String>post(CarUrl.ADDORUPDATEHISTORYLOG_URL)
                .tag(this)
                .headers("authtoken", token)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        DetailsBeans detailsBeans = gson.fromJson(response.body().toString(),
                                DetailsBeans.class);
                        final List<DetailsBeans.DataDicBean.ListBean> listBeans = detailsBeans
                                .getDataDic().getList();

                    }

                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!codingList.isEmpty()) {
            codingList = null;
            codingList.clear();
        }
        if (!partListAll.isEmpty()) {
            partListAll = null;
            partListAll.clear();
        }
    }
}

/*
添加数据库
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
*/
