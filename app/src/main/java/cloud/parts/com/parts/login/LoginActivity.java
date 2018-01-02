package cloud.parts.com.parts.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.activity.MainActivity;

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

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
        ed_login_phoneid = (EditText) findViewById(R.id.ed_login_phoneid);
        ed_login_pwd = (EditText) findViewById(R.id.ed_login_pwd);
        tv_login_getid = (TextView) findViewById(R.id.tv_login_getid);
        tv_login_getid.setOnClickListener(this);
        bt_login_ok = (Button) findViewById(R.id.bt_login_ok);
        bt_login_ok.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
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
        //登录点击跳转逻辑在此
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
}
