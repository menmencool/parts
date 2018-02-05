package cloud.parts.com.parts.login.user_centre;

import java.io.Serializable;

/**
 * 类用途：用户信息
 * 作者：Zhuang
 */

public class User implements Serializable {

    private String accounts; //帐号
    private String pwd; //密码
    private boolean rememberAccounts;
    private boolean autoLogin;
    private String token;//保存token

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User() {
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isRememberAccounts() {
        return rememberAccounts;
    }

    public void setRememberAccounts(boolean rememberAccounts) {
        this.rememberAccounts = rememberAccounts;
    }

    public boolean isAutoLogin() {
        return autoLogin;
    }

    public void setAutoLogin(boolean autoLogin) {
        this.autoLogin = autoLogin;
    }
}
