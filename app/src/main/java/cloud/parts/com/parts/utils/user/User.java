package cloud.parts.com.parts.utils.user;

import java.io.Serializable;

/**
 * 类用途：用户信息
 * 作者：zhuang
 */

public class User implements Serializable{

    private String accounts; //帐号
    private String pwd; //密码
    private boolean rememberAccounts;
    private boolean autoLogin;
    private String docId;
    private String time;//时间戳
    private String deviceId;//设备号码
    private String telephone;
    public User() {
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }
}
