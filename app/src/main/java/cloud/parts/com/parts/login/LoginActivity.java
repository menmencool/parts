package cloud.parts.com.parts.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.TestData;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.activity.MainActivity;
import cloud.parts.com.parts.login.user_centre.LoginBean;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/1/2 15:08
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText ed_login_phoneid;
    private EditText ed_login_pwd;
    private TextView tv_login_getid;
    private Button bt_login_ok;
    private CheckBox cb_login_commitid;
    private CheckBox cb_login_commitlogin;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
        ed_login_phoneid = (EditText) findViewById(R.id.ed_login_phoneid);
        ed_login_pwd = (EditText) findViewById(R.id.ed_login_pwd);
        tv_login_getid = (TextView) findViewById(R.id.tv_login_getid);
        tv_login_getid.setOnClickListener(this);
        bt_login_ok = (Button) findViewById(R.id.bt_login_ok);
        bt_login_ok.setOnClickListener(this);
        cb_login_commitid = (CheckBox) findViewById(R.id.cb_login_commitid);
        cb_login_commitlogin = (CheckBox) findViewById(R.id.cb_login_commitlogin);
        //读取状态
        ed_login_phoneid.setText(UserCentre.getInstance().getAccounts());
        cb_login_commitid.setChecked(UserCentre.getInstance().getRememberAccounts());
    }

    @Override
    protected void initData() {
        boolean autoLogin = UserCentre.getInstance().getAutoLogin();
        if (autoLogin) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            return;
        }
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login_ok:
                submit();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }

    private void submit() {
        // validate
        String phoneid = ed_login_phoneid.getText().toString().trim();
        if (TextUtils.isEmpty(phoneid)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String pwd = ed_login_pwd.getText().toString().trim();
        if (TextUtils.isEmpty(pwd)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }
        boolean remember_accounts = cb_login_commitid.isChecked();
        boolean auto_login = cb_login_commitlogin.isChecked();

        UserCentre.getInstance().setRememberAccounts(remember_accounts);
        UserCentre.getInstance().setAutoLogin(auto_login);

        if (remember_accounts) {
            UserCentre.getInstance().setUserAccounts(phoneid);
        } else {
            UserCentre.getInstance().clearAccounts();
        }

        //登录点击跳转逻辑在此
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

    private void initDatas() {
        UrlBean urlBean = new UrlBean();
        urlBean.setUsername(TestData.username);
        urlBean.setPassword(TestData.password);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.LOGIN_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        LoginBean loginBean = gson.fromJson(response.body().toString(), LoginBean
                                .class);
                        int errorcode = loginBean.getErrorcode();
                        if (errorcode==0) {
                            String token = loginBean.getToken();
                            //保存登录后获取的token
                            UserCentre.getInstance().setToken(token);
                        }else {
                            Toast.makeText(LoginActivity.this, loginBean.getErrormsg(), Toast
                                    .LENGTH_LONG).show();
                        }
                    }
                });

    }
}
/*
Glide.with(context).load(imageUrl).into(imageView);*/
