package cloud.parts.com.parts.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.ui.camera.CameraActivity;
import com.bigkoo.alertview.AlertView;
import com.bigkoo.alertview.OnItemClickListener;
import com.orhanobut.logger.Logger;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.fragment.home.DetailsActivity;
import cloud.parts.com.parts.ocr.FileUtil;
import cloud.parts.com.parts.ocr.RecognizeService;


public class InquireFragment extends Fragment implements OnClickListener {
    private ImageView include_banck;
    private TextView include_titles;
    private ImageView iv_home_scancode;
    // private ArrayList<VINQueryBean.DataDicBean> dataDicBeans = new ArrayList<>();
    private RecyclerView rl_home_carlist;
    //行驶证需要的
    private boolean hasGotToken = false;
    private static final int REQUEST_CODE_VEHICLE_LICENSE = 120;
    private EditText et_home_vinnumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_cloudwithonline, container,
                false);
        // 请选择您的初始化方式
        initAccessToken();  //授权文件、安全模式
        initView(rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void initView(View rootView) {
        include_banck = (ImageView) rootView.findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_titles = (TextView) rootView.findViewById(R.id.include_titles);
        include_titles.setVisibility(View.VISIBLE);
        include_titles.setText("云配在线");
        iv_home_scancode = (ImageView) rootView.findViewById(R.id.iv_home_scancode);
        iv_home_scancode.setOnClickListener(this);
        rl_home_carlist = (RecyclerView) rootView.findViewById(R.id.rl_home_carlist);
        rl_home_carlist.setLayoutManager(new LinearLayoutManager(getActivity()));

        et_home_vinnumber = (EditText) rootView.findViewById(R.id.et_home_vinnumber);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_home_scancode:
                alertShow();
                break;
            case R.id.include_banck:
                getActivity().finish();
                break;
        }
    }
    //对话框
    public void alertShow() {
        new AlertView("选择搜索方式", null, "取消", null,
                new String[]{"扫描行驶证", "直接搜索"},
                getActivity(), AlertView.Style.ActionSheet, new OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                if (position == 0) {
                    if (!checkTokenStatus()) {
                        return;
                    }
                    Intent intent = new Intent(getActivity(), CameraActivity.class);
                    intent.putExtra(CameraActivity.KEY_OUTPUT_FILE_PATH,
                            FileUtil.getSaveFile(getActivity().getApplication()).getAbsolutePath());
                    intent.putExtra(CameraActivity.KEY_CONTENT_TYPE,
                            CameraActivity.CONTENT_TYPE_GENERAL);
                    startActivityForResult(intent, REQUEST_CODE_VEHICLE_LICENSE);
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
            RecognizeService.recVehicleLicense(FileUtil.getSaveFile(getActivity()
                            .getApplicationContext()).getAbsolutePath(),
                    new RecognizeService.ServiceListener() {
                        @Override
                        public void onResult(String result) {
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

    private void submit() {
        // validate
        String vinnumber = et_home_vinnumber.getText().toString().trim();
        if (TextUtils.isEmpty(vinnumber)) {
            Toast.makeText(getContext(), "请输入VIN码...", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        intent.putExtra("VIN", TestData.VIN);//vinnumber
        startActivity(intent);
        et_home_vinnumber.setText("");
    }
/*    public void getData() {
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
                        VINQueryBean vinQueryBean = gson.fromJson(response.body().toString(),
                        VINQueryBean.class);
                        VINQueryBean.DataDicBean dataDic= vinQueryBean.getDataDic();
                        dataDicBeans.add(dataDic);
                        VINQueryAdapter adapter = new VINQueryAdapter(R.layout.vinquery_adapter,
                        dataDicBeans);
                        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                        rl_home_carlist.setAdapter(adapter);
                     *//*   adapter.setOnItemClickListener(new BaseQuickAdapter
                     * .OnItemClickListener() {
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
