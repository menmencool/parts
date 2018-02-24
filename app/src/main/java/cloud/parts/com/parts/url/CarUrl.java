package cloud.parts.com.parts.url;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/9 13:04
 */

public class CarUrl {
    public static final String CAR_URL="http://47.95.240.83:8080/sscvapi/partscloudapi/";
    public static final String Home_URL=CAR_URL+"queryIndexData.json";
    public static final String VIN_URL=CAR_URL+"queryModelByVin.json";
    //通过配件编号查询
    public static final String PARTSBYIDS_URL=CAR_URL+"queryPartsByIds.json";
    /*分组按钮   入参   车型id   配件id   出参  该配件所在分组的全部配件列表
    分组查询  出参   该车型的分组结构  一次性全部返回
    分组下的配件查询接口*/
    public static final String BRANDNAME_URL=CAR_URL+"queryPartsByGrouppkAndBrandname.json";
     //配件详情接口
    public static final String PARTBYPARTCODE_URL=CAR_URL+"queryPartByPartcode.json";
    //历史价格接口
    public static final String HISTORYPRICE_URL=CAR_URL+"queryHistoryPrice.json";
    //图片生成
    public static final String IMAGE_GENERATION="http://47.95.240.83:8080/sscvapi/kaptcha/";
    //登录
    public static final String LOGIN_URL=CAR_URL+"login.json";
}
