package cloud.parts.com.parts.fragment.query.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/4 15:33
 */

public class HistoriBean {


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
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * historyId : 25
             * userid : 3
             * vins : LVVDB11B8B0256034
             * organizationid : 2
             * partList : []
             * organizationname : 中华保险
             * lastupdateTime : Sun Mar 04 15:15:41 CST 2018
             * historyno : BGD-20180304135404
             * fixfactoryid : 0
             * fixfactoryname :
             * modelname : 瑞麒-
             */

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
            private List<?> partList;

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

            public List<?> getPartList() {
                return partList;
            }

            public void setPartList(List<?> partList) {
                this.partList = partList;
            }
        }
    }
}
