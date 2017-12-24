package cloud.parts.com.parts.fragment.home.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/24 13:50
 */

public class DetailsBeans {

    /**
     * errorcode : 0
     * errormsg :
     * dataDic : {"matchParts":[{"partpk":"4","brandname":"宝马","partcode":"1090027482",
     * "saleprice":"597","partname":"Buch","purchaseprice":""},{"partpk":"4959","brandname":"宝马",
     * "partcode":"1090027482","saleprice":"597","partname":"Buch","purchaseprice":""},
     * {"partpk":"5","brandname":"宝马","partcode":"1090031747","saleprice":"163","partname":"Buch
     * Portr鋞","purchaseprice":""},{"partpk":"4961","brandname":"宝马","partcode":"1090031747",
     * "saleprice":"163","partname":"Buch Portr鋞","purchaseprice":""},{"partpk":"7",
     * "brandname":"宝马","partcode":"1090032337","saleprice":"326","partname":"\u201cBook
     * \u201c\u201c75 Yea\u201c","purchaseprice":""},{"partpk":"4965","brandname":"宝马",
     * "partcode":"1090032337","saleprice":"325","partname":"\u201cBook \u201c\u201c75
     * Yea\u201c","purchaseprice":""}],"errorParts":["11111111111111"]}
     */

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
        private List<String> errorParts;

        public List<MatchPartsBean> getMatchParts() {
            return matchParts;
        }

        public void setMatchParts(List<MatchPartsBean> matchParts) {
            this.matchParts = matchParts;
        }

        public List<String> getErrorParts() {
            return errorParts;
        }

        public void setErrorParts(List<String> errorParts) {
            this.errorParts = errorParts;
        }

        public static class MatchPartsBean {
            /**
             * partpk : 4
             * brandname : 宝马
             * partcode : 1090027482
             * saleprice : 597
             * partname : Buch
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
