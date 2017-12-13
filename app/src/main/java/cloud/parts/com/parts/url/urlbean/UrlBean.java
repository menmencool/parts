package cloud.parts.com.parts.url.urlbean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/13 22:48
 */

public class UrlBean {
    /**
     * mobile : 13011111111
     * verifycode : 1234
     */

    private String mobile;
    private String verifycode;
    /**
     * token : 1234567
     */

    private String token;
    /**
     * vin : 5UXZV4C56D0B02465
     */

    private String vin;
    /**
     * ids : ["1090027482","1090031747","1090032337","11111111111111"]
     * brandname : 宝马
     */

    private String brandname;
    private List<String> ids;
    /**
     * grouppk : 1
     * page : 1
     */

    private String grouppk;
    private String page;
    /**
     * userid : 1
     * parts : [{"carmodel":"1","carvin":"121312313","partid":"123123123","partname":"测试",
     * "pricefrom4s":"100","pricefromyp":"90"},{"carmodel":"1","carvin":"121312313",
     * "partid":"123123124","partname":"测试","pricefrom4s":"1001","pricefromyp":"901"}]
     */

    private String userid;
    private List<PartsBean> parts;
    /**
     * partcode : 1090035256
     */

    private String partcode;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getGrouppk() {
        return grouppk;
    }

    public void setGrouppk(String grouppk) {
        this.grouppk = grouppk;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public List<PartsBean> getParts() {
        return parts;
    }

    public void setParts(List<PartsBean> parts) {
        this.parts = parts;
    }

    public String getPartcode() {
        return partcode;
    }

    public void setPartcode(String partcode) {
        this.partcode = partcode;
    }

    public static class PartsBean {
        /**
         * carmodel : 1
         * carvin : 121312313
         * partid : 123123123
         * partname : 测试
         * pricefrom4s : 100
         * pricefromyp : 90
         */

        private String carmodel;
        private String carvin;
        private String partid;
        private String partname;
        private String pricefrom4s;
        private String pricefromyp;

        public String getCarmodel() {
            return carmodel;
        }

        public void setCarmodel(String carmodel) {
            this.carmodel = carmodel;
        }

        public String getCarvin() {
            return carvin;
        }

        public void setCarvin(String carvin) {
            this.carvin = carvin;
        }

        public String getPartid() {
            return partid;
        }

        public void setPartid(String partid) {
            this.partid = partid;
        }

        public String getPartname() {
            return partname;
        }

        public void setPartname(String partname) {
            this.partname = partname;
        }

        public String getPricefrom4s() {
            return pricefrom4s;
        }

        public void setPricefrom4s(String pricefrom4s) {
            this.pricefrom4s = pricefrom4s;
        }

        public String getPricefromyp() {
            return pricefromyp;
        }

        public void setPricefromyp(String pricefromyp) {
            this.pricefromyp = pricefromyp;
        }
    }
}
