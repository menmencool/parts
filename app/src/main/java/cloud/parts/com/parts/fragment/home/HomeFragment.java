package cloud.parts.com.parts.fragment.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.ui.camera.CameraActivity;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.MainActivity;
import cloud.parts.com.parts.fragment.home.bean.HomeBean;
import cloud.parts.com.parts.ocr.FileUtil;
import cloud.parts.com.parts.ocr.RecognizeService;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.utils.GlideImageLoader;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Banner banner;
    private ArrayList<String> imageViews = new ArrayList<>();
    private LinearLayout ll_home_accessories;
    private LinearLayout ll_home_history;
    private LinearLayout ll_home_4s;
    private LinearLayout ll_home_hold;
    private LinearLayout ll_home_offer;
    private LinearLayout ll_home_new;
    private LinearLayout ll_home_notice;
    private LinearLayout ll_home_organization;
    private LinearLayout ll_home_expect;
    private ImageView include_ivmes;
    private TextView include_mes;
    private String ur = "https://www2.autoimg" +
            ".cn/newsdfs/g12/M04/0D/FD/autohomecar__wKjBy1onBlKASqMHAA3e5ox-HPE499.jpg";
    private String sa = "https://www2.autoimg" +
            ".cn/newsdfs/g22/M0C/E7/FB/autohomecar__wKgFW1onZyqAd8U5ABFwZRbqUVw563.jpg";

    //行驶证需要的
    private boolean hasGotToken = false;
    private static final int REQUEST_CODE_VEHICLE_LICENSE = 120;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container,
                false);
        initView(rootView);
        // 请选择您的初始化方式
        initAccessToken();  //授权文件、安全模式
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();

    }

    private void initView(View rootView) {
        banner = (Banner) rootView.findViewById(R.id.banner);
        ll_home_accessories = (LinearLayout) rootView.findViewById(R.id.ll_home_accessories);
        ll_home_accessories.setOnClickListener(this);
        ll_home_history = (LinearLayout) rootView.findViewById(R.id.ll_home_history);
        ll_home_history.setOnClickListener(this);
        ll_home_4s = (LinearLayout) rootView.findViewById(R.id.ll_home_4s);
        ll_home_4s.setOnClickListener(this);
        ll_home_hold = (LinearLayout) rootView.findViewById(R.id.ll_home_hold);
        ll_home_hold.setOnClickListener(this);
        ll_home_offer = (LinearLayout) rootView.findViewById(R.id.ll_home_offer);
        ll_home_offer.setOnClickListener(this);
        ll_home_new = (LinearLayout) rootView.findViewById(R.id.ll_home_new);
        ll_home_new.setOnClickListener(this);
        ll_home_notice = (LinearLayout) rootView.findViewById(R.id.ll_home_notice);
        ll_home_notice.setOnClickListener(this);
        ll_home_organization = (LinearLayout) rootView.findViewById(R.id.ll_home_organization);
        ll_home_organization.setOnClickListener(this);
        ll_home_expect = (LinearLayout) rootView.findViewById(R.id.ll_home_expect);
        ll_home_expect.setOnClickListener(this);
        include_ivmes = (ImageView) rootView.findViewById(R.id.include_ivmes);
        include_ivmes.setOnClickListener(this);
        include_ivmes.setVisibility(View.VISIBLE);
        include_ivmes.setImageResource(R.drawable.aboutus3x);
        include_mes = (TextView) rootView.findViewById(R.id.include_mes);
        include_mes.setVisibility(View.VISIBLE);
        include_mes.setText("关于我们");
        include_mes.setOnClickListener(this);
    }

    private void initData() {
        UrlBean urlBean = new UrlBean();
        urlBean.setToken(TestData.TOKEN);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.Home_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        HomeBean homeBean = gson.fromJson(response.body().toString(), HomeBean
                                .class);
                        List<HomeBean.DataDicBean.BannerBean> banners = homeBean.getDataDic()
                                .getBanner();
                        Log.e("-------------", banners.size() + "");
                      /*  for (int i = 0; i < banners.size(); i++) {
                            imageViews.add(banners.get(i).getImgurl());
                        }*/
                        Logger.e(imageViews.toString());
                        imageViews.add(ur);
                        imageViews.add(sa);
                        banner.setImages(imageViews).setImageLoader(new GlideImageLoader()).start();
                    }
                });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_home_accessories:
                if (!checkTokenStatus()) {
                    return;
                }
                Intent intent = new Intent(getActivity(), CameraActivity.class);
                intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,
                        FileUtil.getSaveFile(getActivity().getApplication()).getAbsolutePath());
                intent.putExtra(CameraActivity.KEY_CONTENT_TYPE,
                        CameraActivity.CONTENT_TYPE_GENERAL);
                startActivityForResult(intent, REQUEST_CODE_VEHICLE_LICENSE);
                /**
                 * 区别Vip
                 */
               // MainActivity.mTabLayout.getTabAt(1).select();


                break;
            case R.id.ll_home_history:
                break;
            case R.id.ll_home_4s:
                startActivity(new Intent(getActivity(), FourSQueryActivity.class));
                break;
            case R.id.ll_home_hold:
                break;
            case R.id.ll_home_offer:
                break;
            case R.id.ll_home_new:
                break;
            case R.id.ll_home_notice:
                break;
            case R.id.ll_home_organization:
                break;
            case R.id.ll_home_expect:
                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        imageViews.clear();
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
            RecognizeService.recVehicleLicense(FileUtil.getSaveFile(getActivity()
                            .getApplicationContext()).getAbsolutePath(),
                    new RecognizeService.ServiceListener() {
                        @Override
                        public void onResult(String result) {
                            //infoPopText(result);
                            Logger.e(result.toString());
                            Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_SHORT)
                                    .show();
                            Intent intent = new Intent(getActivity(), DetailsActivity.class);
                            startActivity(intent);
                        }
                    });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // 释放内存资源
        OCR.getInstance().release();
    }

    /**
     * 行驶证识别
     */
    private boolean checkTokenStatus() {
        if (!hasGotToken) {
            Toast.makeText(getActivity().getApplicationContext(), "token还未成功获取", Toast
                    .LENGTH_LONG).show();
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
        }, getActivity().getApplicationContext());
    }

}
