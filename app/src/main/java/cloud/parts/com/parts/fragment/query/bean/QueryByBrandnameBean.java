package cloud.parts.com.parts.fragment.query.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/1/2 14:06
 */

public class QueryByBrandnameBean {


    private int errorcode;
    private String errormsg;
    private DataDicBean dataDic;

    public int getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public DataDicBean getDataDic() {
        return dataDic;
    }

    public void setDataDic(DataDicBean dataDic) {
        this.dataDic = dataDic;
    }

    public static class DataDicBean {
        private List<MatchPartsBean> matchParts;
        private List<?> errorParts;

        public List<MatchPartsBean> getMatchParts() {
            return matchParts;
        }

        public void setMatchParts(List<MatchPartsBean> matchParts) {
            this.matchParts = matchParts;
        }

        public List<?> getErrorParts() {
            return errorParts;
        }

        public void setErrorParts(List<?> errorParts) {
            this.errorParts = errorParts;
        }

        public static class MatchPartsBean {
            /**
             * partpk : 2
             * brandname : 宝马
             * partcode : 719908002
             * saleprice : 123
             * partname : HEX BOLT
             * purchaseprice :
             */

            private String partpk;
            private String brandname;
            private String partcode;
            private String saleprice;
            private String partname;
            private String purchaseprice;

            public String getPartpk() {
                return partpk;
            }

            public void setPartpk(String partpk) {
                this.partpk = partpk;
            }

            public String getBrandname() {
                return brandname;
            }

            public void setBrandname(String brandname) {
                this.brandname = brandname;
            }

            public String getPartcode() {
                return partcode;
            }

            public void setPartcode(String partcode) {
                this.partcode = partcode;
            }

            public String getSaleprice() {
                return saleprice;
            }

            public void setSaleprice(String saleprice) {
                this.saleprice = saleprice;
            }

            public String getPartname() {
                return partname;
            }

            public void setPartname(String partname) {
                this.partname = partname;
            }

            public String getPurchaseprice() {
                return purchaseprice;
            }

            public void setPurchaseprice(String purchaseprice) {
                this.purchaseprice = purchaseprice;
            }
        }
    }
}
