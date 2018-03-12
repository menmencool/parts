package cloud.parts.com.parts.url;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/9 13:04
 */

public class CarUrl {
    public static final String CAR_URL = "http://123.57.141.113:8080/PartsCloud/api/";
    public static final String Home_URL = CAR_URL + "queryIndexData";
    //histori历史记录接口
    public static final String HISTORI_URL = CAR_URL + "queryHistory";
    //输入VIN和扫描VIN码后的详细接口
    public static final String VIN_URL = CAR_URL + "queryModelByVin";
    // 查询历史（报告单）详情接口 by VIN
    public static final String QUERY_URL = CAR_URL + "queryHistoryByUserIdAndVIN";
    //通过配件编号查询
    public static final String PARTSBYIDS_URL = CAR_URL + "queryPartsByIds.json";
    /*分组按钮   入参   车型id   配件id   出参  该配件所在分组的全部配件列表
    分组查询  出参   该车型的分组结构  一次性全部返回
    分组下的配件查询接口*/
    public static final String BRANDNAME_URL = CAR_URL + "queryPartsByGrouppkAndBrandname.json";
    //登录
    public static final String LOGIN_URL = CAR_URL + "login";
    //查询用户信息接口
    public static final String USERINFO_URL = CAR_URL + "getUserInfo";

    //查询车型全部分组
    public static final String QATG_URL = CAR_URL + "queryTopGroupByBrandNameAndModelId";
    //查询图组
    public static final String QUERYPARTSLIST_URL = CAR_URL + "queryPartsList";
    // 一次查询多个配件信息
    public static final String QUERYPARTSBYI0DS_URL = CAR_URL + "queryPartsByIds";
    //新增历史（报告单）接口
    public static final String ADDORUPDATEHISTORYLOG_URL = CAR_URL + "addOrUpdateHistoryLog";
    // 查询机构信息及雇员列表
    public static final String GETORGINFO_URL = CAR_URL + "getOrgInfo";
    // 新增员工信息// 修改员工信息//删除员工信息
    public static final String ADDORUPDATEUSERINFOURL = CAR_URL + "addOrUpdateUserInfo";
    // 机构通告查询接口// 云配通告查询接口
    public static final String queryNews_URL = CAR_URL + "queryNews";
    // 新增通告接口
    public static final String ADDORUPDATENEWSINFO_URL = CAR_URL + "addOrUpdateNewsInfo";
    //4S店查询接口
    public static final String QUERY4S_URL = CAR_URL + "query4S";
}
