package cloud.parts.com.parts.url.urlbean;

import org.litepal.crud.DataSupport;

import java.util.List;

import cloud.parts.com.parts.fragment.query.bean.DetailsBeans;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/13 22:48
 */

public class UrlBean extends DataSupport{

    /**
     * modelPk : 839
     * brandName : 比亚迪
     */

    private String modelPk;
    private String brandName;
    /**
     * vin : LS4BDB3D57F061666
     */

    private String vin;
    private List<String> ids;
    /**
     * historyId : 1
     */

    private String historyId;
    /**
     * action : 0
     * partsList : [{"part_code":"1234567"},{"part_code":"1234567"},{"part_code":"1234567"},
     * {"part_code":"1234567"}]
     */

    private String action;
    private List<DetailsBeans.DataDicBean.ListBean> partsList;
    /**
     * mobile : 18516858660
     * postion : 经理
     * freeTimes : 100
     * usableTimes : 100
     * password : 12345678
     */

    private String mobile;
    private String postion;
    private String freeTimes;
    private String usableTimes;
    private String password;
    /**
     * userId : 12
     * userName : BillXu
     * userType : 0
     */

    private String userId;
    private String userName;
    private String userType;
    /**
     * province : 北京
     * city : 西城
     * district :
     * keywds : 奥迪
     */

    private String province;
    private String city;
    private String district;
    private String keywds;
    /**
     * status : 0
     */

    private String status;
    /**
     * startDate : 2018-01-01
     * endDate : 2018-03-01
     * fixFactoryId : 1
     */

    private String startDate;
    private String endDate;
    private String fixFactoryId;
    private String token;
    private String topGroupId;
    private String subGroupId;
    private String graphGroupId;
    private String smsToken;

    public String getSmsToken() {
        return smsToken;
    }

    public void setSmsToken(String smsToken) {
        this.smsToken = smsToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getModelPk() {
        return modelPk;
    }

    public void setModelPk(String modelPk) {
        this.modelPk = modelPk;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<DetailsBeans.DataDicBean.ListBean> getPartsList() {
        return partsList;
    }

    public void setPartsList(List<DetailsBeans.DataDicBean.ListBean> partsList) {
        this.partsList = partsList;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getFreeTimes() {
        return freeTimes;
    }

    public void setFreeTimes(String freeTimes) {
        this.freeTimes = freeTimes;
    }

    public String getUsableTimes() {
        return usableTimes;
    }

    public void setUsableTimes(String usableTimes) {
        this.usableTimes = usableTimes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getKeywds() {
        return keywds;
    }

    public void setKeywds(String keywds) {
        this.keywds = keywds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFixFactoryId() {
        return fixFactoryId;
    }

    public void setFixFactoryId(String fixFactoryId) {
        this.fixFactoryId = fixFactoryId;
    }

    public String getTopGroupId() {
        return topGroupId;
    }

    public void setTopGroupId(String topGroupId) {
        this.topGroupId = topGroupId;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getGraphGroupId() {
        return graphGroupId;
    }

    public void setGraphGroupId(String graphGroupId) {
        this.graphGroupId = graphGroupId;
    }

    public static class PartsListBean extends DetailsBeans.DataDicBean.ListBean{
        /**
         * part_code : 1234567
         */

   /*     private String part_code;

        public String getPart_code() {
            return part_code;
        }

        public void setPart_code(String part_code) {
            this.part_code = part_code;
        }*/
    }
}
