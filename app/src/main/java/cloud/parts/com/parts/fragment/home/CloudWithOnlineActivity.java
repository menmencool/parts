package cloud.parts.com.parts.fragment.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.ui.camera.CameraActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.VINQueryAdapter;
import cloud.parts.com.parts.fragment.home.bean.HomeBean;
import cloud.parts.com.parts.fragment.home.bean.VINQueryBean;
import cloud.parts.com.parts.ocr.FileUtil;
import cloud.parts.com.parts.ocr.RecognizeService;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.utils.GlideImageLoader;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/13 22:24
 */

public class CloudWithOnlineActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_titles;
    private ImageView iv_home_scancode;
    private ArrayList<VINQueryBean.DataDicBean> dataDicBeans = new ArrayList<>();
    //行驶证需要的
    private boolean hasGotToken = false;
    private static final int REQUEST_CODE_VEHICLE_LICENSE = 120;
    private RecyclerView rl_home_carlist;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_cloudwithonline);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_titles = (TextView) findViewById(R.id.include_titles);
        include_titles.setVisibility(View.VISIBLE);
        include_titles.setText("云配在线");
        iv_home_scancode = (ImageView) findViewById(R.id.iv_home_scancode);
        iv_home_scancode.setOnClickListener(this);
        // 请选择您的初始化方式
        initAccessToken();  //授权文件、安全模式
        rl_home_carlist = (RecyclerView) findViewById(R.id.rl_home_carlist);
        rl_home_carlist.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void initData() {
        getData();
    }

    @Override
    protected void initListener() {

    }

    public void getData() {
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
                        VINQueryBean vinQueryBean = gson.fromJson(response.body().toString(), VINQueryBean.class);
                        VINQueryBean.DataDicBean dataDic= vinQueryBean.getDataDic();
                        dataDicBeans.add(dataDic);
                        VINQueryAdapter adapter = new VINQueryAdapter(R.layout.vinquery_adapter, dataDicBeans);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_home_carlist.setAdapter(adapter);
                     /*   adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
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
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_home_scancode:
                if (!checkTokenStatus()) {
                    return;
                }
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,
                        FileUtil.getSaveFile(this.getApplication()).getAbsolutePath());
                intent.putExtra(CameraActivity.KEY_CONTENT_TYPE,
                        CameraActivity.CONTENT_TYPE_GENERAL);
                startActivityForResult(intent, REQUEST_CODE_VEHICLE_LICENSE);
                break;
            case R.id.include_banck:
                finish();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * OCR识别返回的结果
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 识别成功回调，行驶证识别
        if (requestCode == REQUEST_CODE_VEHICLE_LICENSE && resultCode == Activity.RESULT_OK) {
            RecognizeService.recVehicleLicense(FileUtil.getSaveFile(getApplicationContext()).getAbsolutePath(),
                    new RecognizeService.ServiceListener() {
                        @Override
                        public void onResult(String result) {
                            //infoPopText(result);
                            Logger.e(result.toString());
                            Toast.makeText(CloudWithOnlineActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 释放内存资源
        OCR.getInstance().release();
    }

    /**
     * 行驶证识别
     */
    private boolean checkTokenStatus() {
        if (!hasGotToken) {
            Toast.makeText(this.getApplicationContext(), "token还未成功获取", Toast.LENGTH_LONG).show();
        }
        Log.e("----------------", hasGotToken + "");
        return hasGotToken;
    }

    //授权文件（安全模式）
    //此种身份验证方案使用授权文件获得AccessToken，缓存在本地。建议有安全考虑的开发者使用此种身份验证方式。
    private void initAccessToken() {
        OCR.getInstance().initAccessToken(new OnResultListener<AccessToken>() {
            @Override
            public void onResult(AccessToken accessToken) {
                // 调用成功，返回AccessToken对象
                String token = accessToken.getAccessToken();
                Log.e("---------------", "token:-------->" + token);
                hasGotToken = true;
            }

            @Override
            public void onError(OCRError error) {
                error.printStackTrace();
                Log.e("============", "onError:licence方式获取token失败---->" + error.getMessage());
            }
        }, getApplicationContext());
    }
}
