package cloud.parts.com.parts.login.user_centre;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/2/4 2:47
 */

public class LoginBean {

    /**
     * status : 0
     * errmsg :
     * userInfo : {"idUsermain":"3","username":"郑艺","mobile":"13381158200","organizationid":"2",
     * "userorganization":"中华保险","positions":"保险经理","freetimes":"999","useabletimes":"100",
     * "expiredate":"Thu Dec 31 00:00:00 CST 2099","usertype":"1","lastlogintime":"Sat Jan 06
     * 17:58:00 CST 2018","registertime":"Wed Nov 15 22:38:07 CST 2017","roleId":"1"}
     * token : e84f6cc4-efad-4370-86c9-e0ea1a53ca6a
     */

    private String status;
    private String errmsg;
    private UserInfoBean userInfo;
    private String token;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class UserInfoBean {
        /**
         * idUsermain : 3
         * username : 郑艺
         * mobile : 13381158200
         * organizationid : 2
         * userorganization : 中华保险
         * positions : 保险经理
         * freetimes : 999
         * useabletimes : 100
         * expiredate : Thu Dec 31 00:00:00 CST 2099
         * usertype : 1
         * lastlogintime : Sat Jan 06 17:58:00 CST 2018
         * registertime : Wed Nov 15 22:38:07 CST 2017
         * roleId : 1
         */

        private String idUsermain;
        private String username;
        private String mobile;
        private String organizationid;
        private String userorganization;
        private String positions;
        private String freetimes;
        private String useabletimes;
        private String expiredate;
        private String usertype;
        private String lastlogintime;
        private String registertime;
        private String roleId;

        public String getIdUsermain() {
            return idUsermain;
        }

        public void setIdUsermain(String idUsermain) {
            this.idUsermain = idUsermain;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getOrganizationid() {
            return organizationid;
        }

        public void setOrganizationid(String organizationid) {
            this.organizationid = organizationid;
        }

        public String getUserorganization() {
            return userorganization;
        }

        public void setUserorganization(String userorganization) {
            this.userorganization = userorganization;
        }

        public String getPositions() {
            return positions;
        }

        public void setPositions(String positions) {
            this.positions = positions;
        }

        public String getFreetimes() {
            return freetimes;
        }

        public void setFreetimes(String freetimes) {
            this.freetimes = freetimes;
        }

        public String getUseabletimes() {
            return useabletimes;
        }

        public void setUseabletimes(String useabletimes) {
            this.useabletimes = useabletimes;
        }

        public String getExpiredate() {
            return expiredate;
        }

        public void setExpiredate(String expiredate) {
            this.expiredate = expiredate;
        }

        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

        public String getLastlogintime() {
            return lastlogintime;
        }

        public void setLastlogintime(String lastlogintime) {
            this.lastlogintime = lastlogintime;
        }

        public String getRegistertime() {
            return registertime;
        }

        public void setRegistertime(String registertime) {
            this.registertime = registertime;
        }

        public String getRoleId() {
            return roleId;
        }

        public void setRoleId(String roleId) {
            this.roleId = roleId;
        }
    }
}
