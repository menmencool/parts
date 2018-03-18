package cloud.parts.com.parts.fragment.home.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/18 12:19
 */

public class FourSQueryBean {

    /**
     * status : 0
     * errmsg :
     * dataDic : {"list":[{"ffAddress":"北京八达岭高速收费站东侧","ffBrands":"宝马、奥迪、奔驰","ffCity":"西城",
     * "ffId":1,"ffName":"博瑞祥云奥迪4S店","ffProvince":"北京","ffTel":"010-100000000"}]}
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
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * ffAddress : 北京八达岭高速收费站东侧
             * ffBrands : 宝马、奥迪、奔驰
             * ffCity : 西城
             * ffId : 1
             * ffName : 博瑞祥云奥迪4S店
             * ffProvince : 北京
             * ffTel : 010-100000000
             */

            private String ffAddress;
            private String ffBrands;
            private String ffCity;
            private int ffId;
            private String ffName;
            private String ffProvince;
            private String ffTel;

            public String getFfAddress() {
                return ffAddress;
            }

            public void setFfAddress(String ffAddress) {
                this.ffAddress = ffAddress;
            }

            public String getFfBrands() {
                return ffBrands;
            }

            public void setFfBrands(String ffBrands) {
                this.ffBrands = ffBrands;
            }

            public String getFfCity() {
                return ffCity;
            }

            public void setFfCity(String ffCity) {
                this.ffCity = ffCity;
            }

            public int getFfId() {
                return ffId;
            }

            public void setFfId(int ffId) {
                this.ffId = ffId;
            }

            public String getFfName() {
                return ffName;
            }

            public void setFfName(String ffName) {
                this.ffName = ffName;
            }

            public String getFfProvince() {
                return ffProvince;
            }

            public void setFfProvince(String ffProvince) {
                this.ffProvince = ffProvince;
            }

            public String getFfTel() {
                return ffTel;
            }

            public void setFfTel(String ffTel) {
                this.ffTel = ffTel;
            }
        }
    }
}
