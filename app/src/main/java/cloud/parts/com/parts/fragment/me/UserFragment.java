package cloud.parts.com.parts.fragment.me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.me.bean.UserInfo;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.utils.CircleImageView;
import cloud.parts.com.parts.utils.DateUtils;

public class UserFragment extends Fragment implements OnClickListener {
    private View root;
    private TextView include_title;
    private CircleImageView ci_user_pic;
    private TextView tv_user_name;
    private TextView tv_user_time;
    private TextView tv_user_userorganization;
    private TextView tv_user_positions;
    private TextView tv_user_freetimes;
    private TextView tv_user_useabletimes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.user_fragment, container, false);
        initView(root);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        initHttpDatas();
    }

    private void initView(View root) {
        include_title = (TextView) root.findViewById(R.id.include_title);
        include_title.setVisibility(View.VISIBLE);
        include_title.setText("个人信息");
        ci_user_pic = (CircleImageView) root.findViewById(R.id.ci_user_pic);
        ci_user_pic.setOnClickListener(this);
        tv_user_name = (TextView) root.findViewById(R.id.tv_user_name);
        tv_user_time = (TextView) root.findViewById(R.id.tv_user_time);
        tv_user_userorganization = (TextView) root.findViewById(R.id.tv_user_userorganization);
        tv_user_positions = (TextView) root.findViewById(R.id.tv_user_positions);
        tv_user_freetimes = (TextView) root.findViewById(R.id.tv_user_freetimes);
        tv_user_useabletimes = (TextView) root.findViewById(R.id.tv_user_useabletimes);
    }

    private void initHttpDatas() {
        String token = UserCentre.getInstance().getToken();
        final UrlBean urlBean = new UrlBean();
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.USERINFO_URL)
                .tag(this)
                .upJson(s)
                .headers("authtoken",token)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        UserInfo userInfo = gson.fromJson(response.body().toString(),
                                UserInfo.class);
                        UserInfo.UserInfoBean userInfoBean = userInfo.getUserInfo();
                        String errorcode = userInfo.getStatus();
                        if (errorcode.equals("0")) {
                            tv_user_name.setText(userInfoBean.getUsername());
                            tv_user_time.setText("到期日期：" + DateUtils.getStringDate(userInfoBean.getExpiredate()));
                            tv_user_userorganization.setText(userInfoBean.getUserorganization());
                            tv_user_positions.setText(userInfoBean.getPositions());
                            tv_user_freetimes.setText(userInfoBean.getFreetimes());
                            tv_user_useabletimes.setText(userInfoBean.getUseabletimes());
                        } else {
                            Toast.makeText(getActivity(), userInfo.getErrmsg(), Toast
                                    .LENGTH_LONG).show();
                        }
                    }
                });

    }


    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            default:
                break;
        }
    }

}


