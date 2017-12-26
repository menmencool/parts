package cloud.parts.com.parts.utils.user;


import cloud.parts.com.parts.utils.SharedPreferencesUtils;

/**
 * 类用途：用户中心
 * 作者：ShiZhuangZhuang
 * 时间：2017/10/21 18:21
 */

public class UserCentre {

    private static UserCentre instance;
    private static User mUser;

    private UserCentre() {
    }

    public static UserCentre getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new UserCentre();
            mUser = new User();
            String accounts = (String) SharedPreferencesUtils.getParam(MyConfig.ACCOUNTS, null);
            String pwd = (String) SharedPreferencesUtils.getParam(MyConfig.PWD, null);
            String docId = (String) SharedPreferencesUtils.getParam(MyConfig.DOCTOR_ID, null);
            boolean auto_login = (boolean) SharedPreferencesUtils.getParam(MyConfig.AUTO_LOGIN, false);
            boolean remember_accounts = (boolean) SharedPreferencesUtils.getParam(MyConfig.REMEMBER_ACCOUNTS, false);
            String time = (String) SharedPreferencesUtils.getParam(MyConfig.STARTTIME, null);
            String deviceId = (String) SharedPreferencesUtils.getParam(MyConfig.DEVICEID, null);
            String telephone = (String) SharedPreferencesUtils.getParam(MyConfig.TELEPHONE, null);
            mUser.setAccounts(accounts);
            mUser.setPwd(pwd);
            mUser.setDocId(docId);
            mUser.setAutoLogin(auto_login);
            mUser.setRememberAccounts(remember_accounts);
            mUser.setTime(time);
            mUser.setDeviceId(deviceId);
            mUser.setTelephone(telephone);
        }
    }

    //设置帐号
    public void setUserAccounts(String accounts) {
        SharedPreferencesUtils.setParam(MyConfig.ACCOUNTS, accounts);
        mUser.setAccounts(accounts);
    }

    //设置密码
    public void setUserPwd(String pwd) {
        SharedPreferencesUtils.setParam(MyConfig.PWD, pwd);
        mUser.setPwd(pwd);
    }

    //设置医生id
    public void setDocId(String docId) {
        SharedPreferencesUtils.setParam(MyConfig.DOCTOR_ID, docId);
        mUser.setDocId(docId);
    }

    //设置是否自动登录
    public void setAutoLogin(boolean login) {
        SharedPreferencesUtils.setParam(MyConfig.AUTO_LOGIN, login);
        mUser.setAutoLogin(login);
    }

    //设置是否记住帐号
    public void setRememberAccounts(boolean rememberAccounts) {
        SharedPreferencesUtils.setParam(MyConfig.REMEMBER_ACCOUNTS, rememberAccounts);
        mUser.setRememberAccounts(rememberAccounts);
    }

    //设置设备号
    public void setDeviceId(String deviceId) {
        SharedPreferencesUtils.setParam(MyConfig.DEVICEID, deviceId);
        mUser.setDeviceId(deviceId);

    }

    //设置时间戳
    public void setTime(String time) {
        SharedPreferencesUtils.setParam(MyConfig.STARTTIME, time);
        mUser.setTime(time);

    }

    //设置手机号
    public void settelephone(String telephone) {
        SharedPreferencesUtils.setParam(MyConfig.TELEPHONE, telephone);
        mUser.setTelephone(telephone);

    }

    //获取帐号
    public String getAccounts() {
        return mUser.getAccounts();
    }

    //获取密码
    public String getPwd() {
        return mUser.getPwd();
    }

    //获取医生ID
    public String getFromId() {
        return mUser.getDocId();
    }

    //获取自动登录状态
    public boolean getAutoLogin() {
        return mUser.isAutoLogin();
    }

    //获取记住密码状态
    public boolean getRememberAccounts() {
        return mUser.isRememberAccounts();
    }

    //获取时间戳
    public String getTime() {

        return mUser.getTime();
    }

    //获取设备号码
    public String getdeviceId() {

        return mUser.getDeviceId();
    }

    //獲取手機號、
    public String gettelephone() {

        return mUser.getTelephone();
    }

    //清除所有信息 （退出登录用）
    public void clear() {
        setDocId(null);
        setUserAccounts(null);
        setUserPwd(null);
        setAutoLogin(false);
        setRememberAccounts(false);
        setTime(null);
        settelephone(null);
        //SharedPreferencesUtils.delete();
    }

    //清除帐号
    public void clearAccounts() {
        setUserAccounts(null);
    }

    //释放资源
    public void destroy() {
        if (!mUser.isAutoLogin()) {
            setDocId(null);
        }
    }

}
