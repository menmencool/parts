package cloud.parts.com.parts.fragment.query.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/4 16:40
 */

public class QueryIVetemBean {

    /**
     * status : 0
     * errmsg :
     * dataDic : {"vincode":"","model":{"model_pk":"828","brand_name":"比亚迪","ppid":"","ppszm":"",
     * "ppmc":"比亚迪","cxzszm":"","cxzmc":"L3","cxiszm":"","cximc":"L3","cxiid":"","cxmc":"2012款
     * 1.5L 手动舒适型","cxid":"","cxmc2":"","nf":"2012","zt":"2015","cjzdjg":"2015","sszdjg":"",
     * "cs":"比亚迪汽车","jb":"紧凑型车","fdj":"","bsx":"手动5档","fdjxh":"BYD473QE","plml":"","pll":"1.5",
     * "jqxs":"","qgplxs":"","qggs":"","qmgs":"","ysb":"","rlxs":"","rybh":"","gyfs":"",
     * "ggcl":"","gtcl":"","hbbz":"","jc":"","dwgs":"","bsxlx":"","qdfs":"","sqxs":"",
     * "imgurl":"http://img.nanxinwang.com/bsm/model/11206.jpg",
     * "configuration":[{"chapter":"基本参数","params":[["车型名称","比亚迪L3 2012款 1.5L 手动舒适型"],["厂商指导价(元)
     * ","5.39万"],["全国4S店最低价",""],["厂商","比亚迪"],["级别","紧凑型车"],["发动机","1.5L 109马力 L4"],["变速箱",
     * "5挡手动"],["长*宽*高(mm)","4568*1716*1480"],["车身结构","4门5座三厢车"],["最高车速(km/h)","170"],
     * ["官方0-100km/h加速(s)","-"],["实测0-100km/h加速(s)","-"],["实测100-0km/h制动(m)","-"],["实测油耗(L/100km)
     * ","-"],["工信部综合油耗(L/100km)","6.3"],["整车质保","四年或10万公里"],["电池容量(kWh)",""]]},{"chapter":"车身",
     * "params":[["长度(mm)","4568"],["宽度(mm)","1716"],["高度(mm)","1480"],["轴距(mm)","2615"],["前轮距
     * (mm)","-"],["后轮距(mm)","-"],["最小离地间隙(mm)","170"],["整备质量(kg))","1210"],["车身颜色","雅典银,天山白,爱琴蓝,
     * 德兰黑,加州红,马赛灰,"],["车门数(个)","4"],["座位数(个)","5"],["油箱容积(L)","-"],["行李厢容积(L)","-"]]},
     * {"chapter":"发动机","params":[["发动机型号","BYD473QE"],["排量(mL)","1488"],["排量(L)","1.5"],["进气形式",
     * "自然吸气"],["气缸排列形式","L"],["气缸数(个)","4"],["每缸气门数(个)","4"],["压缩比","-"],["配气机构","SOHC"],["缸径
     * (mm)","-"],["行程(mm)","-"],["最大马力(Ps)","109"],["最大功率(kW)","80"],["最大功率转速(rpm)","5800"],
     * ["最大扭矩(N·m)","145"],["最大扭矩转速(rpm)","4800"],["发动机特有技术","VVL可变气门升程"],["燃料形式","汽油"],["燃油标号",
     * "93号(京92号)"],["供油方式","多点电喷"],["缸盖材料","铝"],["缸体材料","铝"],["环保标准","国IV"]]},{"chapter":"变速箱",
     * "params":[["换档形式(简称)","5挡手动"],["挡位个数","5"],["变速箱类型","手动变速箱(MT)"],["变速器型号",""],["变速器油标准",
     * "MTF 75W-90"]]},{"chapter":"驱动方式","params":[["驱动方式","前置前驱"],["四驱形式",""],["中央差速器结构",""],
     * ["前悬架类型","麦弗逊式独立悬架"],["后悬架类型","拖曳臂式后悬架"],["助力类型","机械液压助力"],["车体结构","承载式"]]},
     * {"chapter":"车轮制动","params":[["前制动器类型","通风盘式"],["后制动器类型","盘式"],["驻车制动类型","手刹"],["前轮胎规格",
     * "195/60 R15"],["后轮胎规格","195/60 R15"],["备胎规格","全尺寸"]]},{"chapter":"安全装备",
     * "params":[["主/副驾驶座安全气囊","主● / 副●"],["前/后排侧气囊","-"],["前/后排头部气囊(气帘)","-"],["膝部气囊","-"],
     * ["胎压监测装置","-"],["零胎压继续行驶","-"],["安全带未系提示","●"],["ISOFIX儿童座椅接口","-"],["发动机电子防盗","●"],
     * ["车内中控锁","●"],["遥控钥匙","●"],["无钥匙启动系统","●"],["无钥匙进入系统","●"]]},{"chapter":"操控配置",
     * "params":[["ABS防抱死","●"],["制动力分配(EBD/CBC等)","●"],["刹车辅助(EBA/BAS/BA等)","-"],["牵引力控制
     * (ASR/TCS/TRC等)","-"],["车身稳定控制(ESC/ESP/DSC等)","-"],["上坡辅助","-"],["自动驻车/上坡辅助",""],["陡坡缓降",
     * "-"],["可变悬架","-"],["空气悬架","-"],["可变转向比","-"],["前桥限滑差速器/差速锁","-"],["中央差速器锁止功能","-"],
     * ["后桥限滑差速器/差速锁","-"]]},{"chapter":"外部配置","params":[["电动天窗","-"],["全景天窗","-"],["运动外观套件",
     * "-"],["铝合金轮圈","○"],["电动吸合门","-"],["侧滑门","-"],["电动后备厢","-"]]},{"chapter":"内部配置",
     * "params":[["真皮方向盘","●"],["方向盘调节","上下调节"],["方向盘电动调节","-"],["多功能方向盘","-"],["方向盘换挡","-"],
     * ["方向盘加热","-"],["定速巡航","-"],["前/后驻车雷达","-"],["倒车视频影像","-"],["行车电脑显示屏","●"],["HUD抬头数字显示",
     * "-"]]},{"chapter":"座椅配置","params":[["真皮/仿皮座椅","●"],["运动风格座椅","-"],["座椅高低调节","-"],
     * ["腰部支撑调节","-"],["肩部支撑调节","-"],["主/副驾驶座电动调节","-"],["第二排靠背角度调节","-"],["第二排座椅移动","-"],
     * ["后排座椅电动调节","-"],["电动座椅记忆","-"],["前/后排座椅加热","-"],["前/后排座椅通风","-"],["前/后排座椅按摩","-"],
     * ["后排座椅放倒方式","-"],["第三排座椅","-"],["前/后中央扶手","前● / 后- "],["后排杯架","-"],["LATCH座椅接口(兼容ISOFIX)",
     * ""],["儿童座椅接口",""]]},{"chapter":"多媒体配置","params":[["GPS导航系统","-"],["定位互动服务","-"],
     * ["中控台彩色大屏","-"],["内置硬盘","-"],["蓝牙/车载电话","-"],["车载电视","-"],["后排液晶屏","-"],["外接音源接口
     * (AUX/USB/iPod等)","●"],["CD支持MP3/WMA","-"],["多媒体系统","单碟CD"],["扬声器数量","4-5喇叭"]]},
     * {"chapter":"灯光配置","params":[["氙气大灯","-"],["LED大灯","-"],["日间行车灯","-"],["自动头灯","-"],
     * ["转向辅助灯","-"],["转向头灯","-"],["转向头灯(辅助灯)",""],["前雾灯","-"],["大灯高度可调","●"],["大灯清洗装置","-"],
     * ["车内氛围灯","-"]]},{"chapter":"玻璃/后视镜","params":[["前/后电动车窗","前● / 后●"],["车窗防夹手功能","-"],
     * ["防紫外线/隔热玻璃","-"],["后视镜电动调节","●"],["后视镜加热","-"],["内/外后视镜自动防眩目","-"],["后视镜电动折叠","-"],
     * ["后视镜记忆","-"],["后风挡遮阳帘","-"],["后排侧遮阳帘","-"],["后排侧隐私玻璃","-"],["遮阳板化妆镜","●"],["后雨刷","-"],
     * ["感应雨刷","-"]]},{"chapter":"空调/冰箱","params":[["空调控制方式","手动●"],["后排独立空调","-"],["后座出风口","-"],
     * ["温度分区控制","-"],["车内空气调节/花粉过滤","●"],["车载冰箱","-"]]},{"chapter":"高科技配置","params":[["人机交互系统",
     * ""],["自动泊车入位","-"],["发动机启停技术","-"],["并线辅助","-"],["车道偏离预警系统","-"],["主动刹车/主动安全系统","-"],
     * ["整体主动转向系统","-"],["夜视系统","-"],["中控液晶屏分屏显示","-"],["自适应巡航","-"],["全景摄像头","-"]]}]},
     * "partList":[{"status":"1","part_code":"10499269-00"},{"status":"1",
     * "part_code":"1010X-6306200"},{"part_name":"背门铰链组件(左)","part_pk":"860311",
     * "purchase_price":"0.0","sale_price":"11.0","status":"0","last_modified_time":"2018-01-27
     * 18:44:17.0","create_time":"2018-01-27 18:44:17.0","part_code_2":"1010X-6306200",
     * "part_code":"G1073","brand_name":"长安"},{"part_name":"O形密封圈12345","part_pk":"860313",
     * "purchase_price":"0.0","sale_price":"1.0","status":"0","last_modified_time":"2018-01-27
     * 18:44:17.0","create_time":"2018-01-27 18:44:17.0","part_code_2":"1008034D",
     * "part_code":"G108-1","brand_name":"长安"}],"historyId":"17","userid":"3",
     * "vins":"LGXC16DF7C0178765","organizationid":"2","organizationname":"中华保险",
     * "lastupdateTime":"Sun Mar 04 13:42:18 CST 2018","historyno":"BGD-20180224220358",
     * "fixfactoryid":"0","fixfactoryname":"","modelname":"比亚迪-2012款 1.5L 手动舒适型"}
     */

    private String status;
    private String errmsg;
    private DataDicBean dataDic;

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

    public DataDicBean getDataDic() {
        return dataDic;
    }

    public void setDataDic(DataDicBean dataDic) {
        this.dataDic = dataDic;
    }

    public static class DataDicBean {
        /**
         * vincode :
         * model : {"model_pk":"828","brand_name":"比亚迪","ppid":"","ppszm":"","ppmc":"比亚迪",
         * "cxzszm":"","cxzmc":"L3","cxiszm":"","cximc":"L3","cxiid":"","cxmc":"2012款 1.5L
         * 手动舒适型","cxid":"","cxmc2":"","nf":"2012","zt":"2015","cjzdjg":"2015","sszdjg":"",
         * "cs":"比亚迪汽车","jb":"紧凑型车","fdj":"","bsx":"手动5档","fdjxh":"BYD473QE","plml":"",
         * "pll":"1.5","jqxs":"","qgplxs":"","qggs":"","qmgs":"","ysb":"","rlxs":"","rybh":"",
         * "gyfs":"","ggcl":"","gtcl":"","hbbz":"","jc":"","dwgs":"","bsxlx":"","qdfs":"",
         * "sqxs":"","imgurl":"http://img.nanxinwang.com/bsm/model/11206.jpg",
         * "configuration":[{"chapter":"基本参数","params":[["车型名称","比亚迪L3 2012款 1.5L 手动舒适型"],["厂商指导价
         * (元)","5.39万"],["全国4S店最低价",""],["厂商","比亚迪"],["级别","紧凑型车"],["发动机","1.5L 109马力 L4"],
         * ["变速箱","5挡手动"],["长*宽*高(mm)","4568*1716*1480"],["车身结构","4门5座三厢车"],["最高车速(km/h)","170"],
         * ["官方0-100km/h加速(s)","-"],["实测0-100km/h加速(s)","-"],["实测100-0km/h制动(m)","-"],["实测油耗
         * (L/100km)","-"],["工信部综合油耗(L/100km)","6.3"],["整车质保","四年或10万公里"],["电池容量(kWh)",""]]},
         * {"chapter":"车身","params":[["长度(mm)","4568"],["宽度(mm)","1716"],["高度(mm)","1480"],["轴距
         * (mm)","2615"],["前轮距(mm)","-"],["后轮距(mm)","-"],["最小离地间隙(mm)","170"],["整备质量(kg))",
         * "1210"],["车身颜色","雅典银,天山白,爱琴蓝,德兰黑,加州红,马赛灰,"],["车门数(个)","4"],["座位数(个)","5"],["油箱容积(L)",
         * "-"],["行李厢容积(L)","-"]]},{"chapter":"发动机","params":[["发动机型号","BYD473QE"],["排量(mL)",
         * "1488"],["排量(L)","1.5"],["进气形式","自然吸气"],["气缸排列形式","L"],["气缸数(个)","4"],["每缸气门数(个)",
         * "4"],["压缩比","-"],["配气机构","SOHC"],["缸径(mm)","-"],["行程(mm)","-"],["最大马力(Ps)","109"],
         * ["最大功率(kW)","80"],["最大功率转速(rpm)","5800"],["最大扭矩(N·m)","145"],["最大扭矩转速(rpm)","4800"],
         * ["发动机特有技术","VVL可变气门升程"],["燃料形式","汽油"],["燃油标号","93号(京92号)"],["供油方式","多点电喷"],["缸盖材料",
         * "铝"],["缸体材料","铝"],["环保标准","国IV"]]},{"chapter":"变速箱","params":[["换档形式(简称)","5挡手动"],
         * ["挡位个数","5"],["变速箱类型","手动变速箱(MT)"],["变速器型号",""],["变速器油标准","MTF 75W-90"]]},
         * {"chapter":"驱动方式","params":[["驱动方式","前置前驱"],["四驱形式",""],["中央差速器结构",""],["前悬架类型",
         * "麦弗逊式独立悬架"],["后悬架类型","拖曳臂式后悬架"],["助力类型","机械液压助力"],["车体结构","承载式"]]},{"chapter":"车轮制动",
         * "params":[["前制动器类型","通风盘式"],["后制动器类型","盘式"],["驻车制动类型","手刹"],["前轮胎规格","195/60 R15"],
         * ["后轮胎规格","195/60 R15"],["备胎规格","全尺寸"]]},{"chapter":"安全装备","params":[["主/副驾驶座安全气囊","主●
         * / 副●"],["前/后排侧气囊","-"],["前/后排头部气囊(气帘)","-"],["膝部气囊","-"],["胎压监测装置","-"],["零胎压继续行驶",
         * "-"],["安全带未系提示","●"],["ISOFIX儿童座椅接口","-"],["发动机电子防盗","●"],["车内中控锁","●"],["遥控钥匙","●"],
         * ["无钥匙启动系统","●"],["无钥匙进入系统","●"]]},{"chapter":"操控配置","params":[["ABS防抱死","●"],["制动力分配
         * (EBD/CBC等)","●"],["刹车辅助(EBA/BAS/BA等)","-"],["牵引力控制(ASR/TCS/TRC等)","-"],["车身稳定控制
         * (ESC/ESP/DSC等)","-"],["上坡辅助","-"],["自动驻车/上坡辅助",""],["陡坡缓降","-"],["可变悬架","-"],["空气悬架",
         * "-"],["可变转向比","-"],["前桥限滑差速器/差速锁","-"],["中央差速器锁止功能","-"],["后桥限滑差速器/差速锁","-"]]},
         * {"chapter":"外部配置","params":[["电动天窗","-"],["全景天窗","-"],["运动外观套件","-"],["铝合金轮圈","○"],
         * ["电动吸合门","-"],["侧滑门","-"],["电动后备厢","-"]]},{"chapter":"内部配置","params":[["真皮方向盘","●"],
         * ["方向盘调节","上下调节"],["方向盘电动调节","-"],["多功能方向盘","-"],["方向盘换挡","-"],["方向盘加热","-"],["定速巡航",
         * "-"],["前/后驻车雷达","-"],["倒车视频影像","-"],["行车电脑显示屏","●"],["HUD抬头数字显示","-"]]},
         * {"chapter":"座椅配置","params":[["真皮/仿皮座椅","●"],["运动风格座椅","-"],["座椅高低调节","-"],["腰部支撑调节",
         * "-"],["肩部支撑调节","-"],["主/副驾驶座电动调节","-"],["第二排靠背角度调节","-"],["第二排座椅移动","-"],["后排座椅电动调节",
         * "-"],["电动座椅记忆","-"],["前/后排座椅加热","-"],["前/后排座椅通风","-"],["前/后排座椅按摩","-"],["后排座椅放倒方式",
         * "-"],["第三排座椅","-"],["前/后中央扶手","前● / 后- "],["后排杯架","-"],["LATCH座椅接口(兼容ISOFIX)",""],
         * ["儿童座椅接口",""]]},{"chapter":"多媒体配置","params":[["GPS导航系统","-"],["定位互动服务","-"],
         * ["中控台彩色大屏","-"],["内置硬盘","-"],["蓝牙/车载电话","-"],["车载电视","-"],["后排液晶屏","-"],["外接音源接口
         * (AUX/USB/iPod等)","●"],["CD支持MP3/WMA","-"],["多媒体系统","单碟CD"],["扬声器数量","4-5喇叭"]]},
         * {"chapter":"灯光配置","params":[["氙气大灯","-"],["LED大灯","-"],["日间行车灯","-"],["自动头灯","-"],
         * ["转向辅助灯","-"],["转向头灯","-"],["转向头灯(辅助灯)",""],["前雾灯","-"],["大灯高度可调","●"],["大灯清洗装置","-"],
         * ["车内氛围灯","-"]]},{"chapter":"玻璃/后视镜","params":[["前/后电动车窗","前● / 后●"],["车窗防夹手功能","-"],
         * ["防紫外线/隔热玻璃","-"],["后视镜电动调节","●"],["后视镜加热","-"],["内/外后视镜自动防眩目","-"],["后视镜电动折叠","-"],
         * ["后视镜记忆","-"],["后风挡遮阳帘","-"],["后排侧遮阳帘","-"],["后排侧隐私玻璃","-"],["遮阳板化妆镜","●"],["后雨刷",
         * "-"],["感应雨刷","-"]]},{"chapter":"空调/冰箱","params":[["空调控制方式","手动●"],["后排独立空调","-"],
         * ["后座出风口","-"],["温度分区控制","-"],["车内空气调节/花粉过滤","●"],["车载冰箱","-"]]},{"chapter":"高科技配置",
         * "params":[["人机交互系统",""],["自动泊车入位","-"],["发动机启停技术","-"],["并线辅助","-"],["车道偏离预警系统","-"],
         * ["主动刹车/主动安全系统","-"],["整体主动转向系统","-"],["夜视系统","-"],["中控液晶屏分屏显示","-"],["自适应巡航","-"],
         * ["全景摄像头","-"]]}]}
         * partList : [{"status":"1","part_code":"10499269-00"},{"status":"1",
         * "part_code":"1010X-6306200"},{"part_name":"背门铰链组件(左)","part_pk":"860311",
         * "purchase_price":"0.0","sale_price":"11.0","status":"0",
         * "last_modified_time":"2018-01-27 18:44:17.0","create_time":"2018-01-27 18:44:17.0",
         * "part_code_2":"1010X-6306200","part_code":"G1073","brand_name":"长安"},
         * {"part_name":"O形密封圈12345","part_pk":"860313","purchase_price":"0.0",
         * "sale_price":"1.0","status":"0","last_modified_time":"2018-01-27 18:44:17.0",
         * "create_time":"2018-01-27 18:44:17.0","part_code_2":"1008034D","part_code":"G108-1",
         * "brand_name":"长安"}]
         * historyId : 17
         * userid : 3
         * vins : LGXC16DF7C0178765
         * organizationid : 2
         * organizationname : 中华保险
         * lastupdateTime : Sun Mar 04 13:42:18 CST 2018
         * historyno : BGD-20180224220358
         * fixfactoryid : 0
         * fixfactoryname :
         * modelname : 比亚迪-2012款 1.5L 手动舒适型
         */

        private String vincode;
        private ModelBean model;
        private String historyId;
        private String userid;
        private String vins;
        private String organizationid;
        private String organizationname;
        private String lastupdateTime;
        private String historyno;
        private String fixfactoryid;
        private String fixfactoryname;
        private String modelname;
        private ArrayList<PartListBean> partList;

        public String getVincode() {
            return vincode;
        }

        public void setVincode(String vincode) {
            this.vincode = vincode;
        }

        public ModelBean getModel() {
            return model;
        }

        public void setModel(ModelBean model) {
            this.model = model;
        }

        public String getHistoryId() {
            return historyId;
        }

        public void setHistoryId(String historyId) {
            this.historyId = historyId;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getVins() {
            return vins;
        }

        public void setVins(String vins) {
            this.vins = vins;
        }

        public String getOrganizationid() {
            return organizationid;
        }

        public void setOrganizationid(String organizationid) {
            this.organizationid = organizationid;
        }

        public String getOrganizationname() {
            return organizationname;
        }

        public void setOrganizationname(String organizationname) {
            this.organizationname = organizationname;
        }

        public String getLastupdateTime() {
            return lastupdateTime;
        }

        public void setLastupdateTime(String lastupdateTime) {
            this.lastupdateTime = lastupdateTime;
        }

        public String getHistoryno() {
            return historyno;
        }

        public void setHistoryno(String historyno) {
            this.historyno = historyno;
        }

        public String getFixfactoryid() {
            return fixfactoryid;
        }

        public void setFixfactoryid(String fixfactoryid) {
            this.fixfactoryid = fixfactoryid;
        }

        public String getFixfactoryname() {
            return fixfactoryname;
        }

        public void setFixfactoryname(String fixfactoryname) {
            this.fixfactoryname = fixfactoryname;
        }

        public String getModelname() {
            return modelname;
        }

        public void setModelname(String modelname) {
            this.modelname = modelname;
        }

        public ArrayList<PartListBean> getPartList() {
            return partList;
        }

        public void setPartList(ArrayList<PartListBean> partList) {
            this.partList = partList;
        }

        public static class ModelBean {

            private String model_pk;
            private String brand_name;
            private String ppid;
            private String ppszm;
            private String ppmc;
            private String cxzszm;
            private String cxzmc;
            private String cxiszm;
            private String cximc;
            private String cxiid;
            private String cxmc;
            private String cxid;
            private String cxmc2;
            private String nf;
            private String zt;
            private String cjzdjg;
            private String sszdjg;
            private String cs;
            private String jb;
            private String fdj;
            private String bsx;
            private String fdjxh;
            private String plml;
            private String pll;
            private String jqxs;
            private String qgplxs;
            private String qggs;
            private String qmgs;
            private String ysb;
            private String rlxs;
            private String rybh;
            private String gyfs;
            private String ggcl;
            private String gtcl;
            private String hbbz;
            private String jc;
            private String dwgs;
            private String bsxlx;
            private String qdfs;
            private String sqxs;
            private String imgurl;
            private List<ConfigurationBean> configuration;

            public String getModel_pk() {
                return model_pk;
            }

            public void setModel_pk(String model_pk) {
                this.model_pk = model_pk;
            }

            public String getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(String brand_name) {
                this.brand_name = brand_name;
            }

            public String getPpid() {
                return ppid;
            }

            public void setPpid(String ppid) {
                this.ppid = ppid;
            }

            public String getPpszm() {
                return ppszm;
            }

            public void setPpszm(String ppszm) {
                this.ppszm = ppszm;
            }

            public String getPpmc() {
                return ppmc;
            }

            public void setPpmc(String ppmc) {
                this.ppmc = ppmc;
            }

            public String getCxzszm() {
                return cxzszm;
            }

            public void setCxzszm(String cxzszm) {
                this.cxzszm = cxzszm;
            }

            public String getCxzmc() {
                return cxzmc;
            }

            public void setCxzmc(String cxzmc) {
                this.cxzmc = cxzmc;
            }

            public String getCxiszm() {
                return cxiszm;
            }

            public void setCxiszm(String cxiszm) {
                this.cxiszm = cxiszm;
            }

            public String getCximc() {
                return cximc;
            }

            public void setCximc(String cximc) {
                this.cximc = cximc;
            }

            public String getCxiid() {
                return cxiid;
            }

            public void setCxiid(String cxiid) {
                this.cxiid = cxiid;
            }

            public String getCxmc() {
                return cxmc;
            }

            public void setCxmc(String cxmc) {
                this.cxmc = cxmc;
            }

            public String getCxid() {
                return cxid;
            }

            public void setCxid(String cxid) {
                this.cxid = cxid;
            }

            public String getCxmc2() {
                return cxmc2;
            }

            public void setCxmc2(String cxmc2) {
                this.cxmc2 = cxmc2;
            }

            public String getNf() {
                return nf;
            }

            public void setNf(String nf) {
                this.nf = nf;
            }

            public String getZt() {
                return zt;
            }

            public void setZt(String zt) {
                this.zt = zt;
            }

            public String getCjzdjg() {
                return cjzdjg;
            }

            public void setCjzdjg(String cjzdjg) {
                this.cjzdjg = cjzdjg;
            }

            public String getSszdjg() {
                return sszdjg;
            }

            public void setSszdjg(String sszdjg) {
                this.sszdjg = sszdjg;
            }

            public String getCs() {
                return cs;
            }

            public void setCs(String cs) {
                this.cs = cs;
            }

            public String getJb() {
                return jb;
            }

            public void setJb(String jb) {
                this.jb = jb;
            }

            public String getFdj() {
                return fdj;
            }

            public void setFdj(String fdj) {
                this.fdj = fdj;
            }

            public String getBsx() {
                return bsx;
            }

            public void setBsx(String bsx) {
                this.bsx = bsx;
            }

            public String getFdjxh() {
                return fdjxh;
            }

            public void setFdjxh(String fdjxh) {
                this.fdjxh = fdjxh;
            }

            public String getPlml() {
                return plml;
            }

            public void setPlml(String plml) {
                this.plml = plml;
            }

            public String getPll() {
                return pll;
            }

            public void setPll(String pll) {
                this.pll = pll;
            }

            public String getJqxs() {
                return jqxs;
            }

            public void setJqxs(String jqxs) {
                this.jqxs = jqxs;
            }

            public String getQgplxs() {
                return qgplxs;
            }

            public void setQgplxs(String qgplxs) {
                this.qgplxs = qgplxs;
            }

            public String getQggs() {
                return qggs;
            }

            public void setQggs(String qggs) {
                this.qggs = qggs;
            }

            public String getQmgs() {
                return qmgs;
            }

            public void setQmgs(String qmgs) {
                this.qmgs = qmgs;
            }

            public String getYsb() {
                return ysb;
            }

            public void setYsb(String ysb) {
                this.ysb = ysb;
            }

            public String getRlxs() {
                return rlxs;
            }

            public void setRlxs(String rlxs) {
                this.rlxs = rlxs;
            }

            public String getRybh() {
                return rybh;
            }

            public void setRybh(String rybh) {
                this.rybh = rybh;
            }

            public String getGyfs() {
                return gyfs;
            }

            public void setGyfs(String gyfs) {
                this.gyfs = gyfs;
            }

            public String getGgcl() {
                return ggcl;
            }

            public void setGgcl(String ggcl) {
                this.ggcl = ggcl;
            }

            public String getGtcl() {
                return gtcl;
            }

            public void setGtcl(String gtcl) {
                this.gtcl = gtcl;
            }

            public String getHbbz() {
                return hbbz;
            }

            public void setHbbz(String hbbz) {
                this.hbbz = hbbz;
            }

            public String getJc() {
                return jc;
            }

            public void setJc(String jc) {
                this.jc = jc;
            }

            public String getDwgs() {
                return dwgs;
            }

            public void setDwgs(String dwgs) {
                this.dwgs = dwgs;
            }

            public String getBsxlx() {
                return bsxlx;
            }

            public void setBsxlx(String bsxlx) {
                this.bsxlx = bsxlx;
            }

            public String getQdfs() {
                return qdfs;
            }

            public void setQdfs(String qdfs) {
                this.qdfs = qdfs;
            }

            public String getSqxs() {
                return sqxs;
            }

            public void setSqxs(String sqxs) {
                this.sqxs = sqxs;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public List<ConfigurationBean> getConfiguration() {
                return configuration;
            }

            public void setConfiguration(List<ConfigurationBean> configuration) {
                this.configuration = configuration;
            }

            public static class ConfigurationBean {
                /**
                 * chapter : 基本参数
                 * params : [["车型名称","比亚迪L3 2012款 1.5L 手动舒适型"],["厂商指导价(元)","5.39万"],["全国4S店最低价",""],["厂商","比亚迪"],["级别","紧凑型车"],["发动机","1.5L 109马力 L4"],["变速箱","5挡手动"],["长*宽*高(mm)","4568*1716*1480"],["车身结构","4门5座三厢车"],["最高车速(km/h)","170"],["官方0-100km/h加速(s)","-"],["实测0-100km/h加速(s)","-"],["实测100-0km/h制动(m)","-"],["实测油耗(L/100km)","-"],["工信部综合油耗(L/100km)","6.3"],["整车质保","四年或10万公里"],["电池容量(kWh)",""]]
                 */

                private String chapter;
                private List<List<String>> params;

                public String getChapter() {
                    return chapter;
                }

                public void setChapter(String chapter) {
                    this.chapter = chapter;
                }

                public List<List<String>> getParams() {
                    return params;
                }

                public void setParams(List<List<String>> params) {
                    this.params = params;
                }
            }
        }

        public static class PartListBean implements Parcelable{
            /**
             * status : 1
             * part_code : 10499269-00
             * part_name : 背门铰链组件(左)
             * part_pk : 860311
             * purchase_price : 0.0
             * sale_price : 11.0
             * last_modified_time : 2018-01-27 18:44:17.0
             * create_time : 2018-01-27 18:44:17.0
             * part_code_2 : 1010X-6306200
             * brand_name : 长安
             */

            private String status;
            private String part_code;
            private String part_name;
            private String part_pk;
            private String purchase_price;
            private String sale_price;
            private String last_modified_time;
            private String create_time;
            private String part_code_2;
            private String brand_name;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getPart_code() {
                return part_code;
            }

            public void setPart_code(String part_code) {
                this.part_code = part_code;
            }

            public String getPart_name() {
                return part_name;
            }

            public void setPart_name(String part_name) {
                this.part_name = part_name;
            }

            public String getPart_pk() {
                return part_pk;
            }

            public void setPart_pk(String part_pk) {
                this.part_pk = part_pk;
            }

            public String getPurchase_price() {
                return purchase_price;
            }

            public void setPurchase_price(String purchase_price) {
                this.purchase_price = purchase_price;
            }

            public String getSale_price() {
                return sale_price;
            }

            public void setSale_price(String sale_price) {
                this.sale_price = sale_price;
            }

            public String getLast_modified_time() {
                return last_modified_time;
            }

            public void setLast_modified_time(String last_modified_time) {
                this.last_modified_time = last_modified_time;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getPart_code_2() {
                return part_code_2;
            }

            public void setPart_code_2(String part_code_2) {
                this.part_code_2 = part_code_2;
            }

            public String getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(String brand_name) {
                this.brand_name = brand_name;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.status);
                dest.writeString(this.part_code);
                dest.writeString(this.part_name);
                dest.writeString(this.part_pk);
                dest.writeString(this.purchase_price);
                dest.writeString(this.sale_price);
                dest.writeString(this.last_modified_time);
                dest.writeString(this.create_time);
                dest.writeString(this.part_code_2);
                dest.writeString(this.brand_name);
            }

            public PartListBean() {
            }

            protected PartListBean(Parcel in) {
                this.status = in.readString();
                this.part_code = in.readString();
                this.part_name = in.readString();
                this.part_pk = in.readString();
                this.purchase_price = in.readString();
                this.sale_price = in.readString();
                this.last_modified_time = in.readString();
                this.create_time = in.readString();
                this.part_code_2 = in.readString();
                this.brand_name = in.readString();
            }

            public static final Creator<PartListBean> CREATOR = new Creator<PartListBean>() {
                @Override
                public PartListBean createFromParcel(Parcel source) {
                    return new PartListBean(source);
                }

                @Override
                public PartListBean[] newArray(int size) {
                    return new PartListBean[size];
                }
            };
        }
    }
}
