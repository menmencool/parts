package cloud.parts.com.parts.fragment.query.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/24 13:50
 */

public class DetailsBeans {


    /**
     * status : 0
     * errmsg :
     * knownAmt : 1
     * unknownAmt : 2
     * sumAmt : 3
     * dataDic : {"list":[{"part_name":"S6-3721020_低音蜗牛电子喇叭_M00000","part_pk":"1537016","purchase_price":"94.3","sale_price":"159.0","status":"0","last_modified_time":"2018-03-04 16:29:49.0","adaptable_model":"S6","create_time":"2018-03-04 16:29:49.0","part_code":"1053401000","comment":"请订购10747564-00。切换状态","brand_name":"比亚迪"},{"status":"1","part_code":"11002212348"},{"status":"1","part_code":"11002212348"}]}
     */

    private String status;
    private String errmsg;
    private String knownAmt;
    private String unknownAmt;
    private String sumAmt;
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

    public String getKnownAmt() {
        return knownAmt;
    }

    public void setKnownAmt(String knownAmt) {
        this.knownAmt = knownAmt;
    }

    public String getUnknownAmt() {
        return unknownAmt;
    }

    public void setUnknownAmt(String unknownAmt) {
        this.unknownAmt = unknownAmt;
    }

    public String getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(String sumAmt) {
        this.sumAmt = sumAmt;
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
             * part_name : S6-3721020_低音蜗牛电子喇叭_M00000
             * part_pk : 1537016
             * purchase_price : 94.3
             * sale_price : 159.0
             * status : 0
             * last_modified_time : 2018-03-04 16:29:49.0
             * adaptable_model : S6
             * create_time : 2018-03-04 16:29:49.0
             * part_code : 1053401000
             * comment : 请订购10747564-00。切换状态
             * brand_name : 比亚迪
             */

            private String part_name;
            private String part_pk;
            private String purchase_price;
            private String sale_price;
            private String status;
            private String last_modified_time;
            private String adaptable_model;
            private String create_time;
            private String part_code;
            private String comment;
            private String brand_name;

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

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getLast_modified_time() {
                return last_modified_time;
            }

            public void setLast_modified_time(String last_modified_time) {
                this.last_modified_time = last_modified_time;
            }

            public String getAdaptable_model() {
                return adaptable_model;
            }

            public void setAdaptable_model(String adaptable_model) {
                this.adaptable_model = adaptable_model;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getPart_code() {
                return part_code;
            }

            public void setPart_code(String part_code) {
                this.part_code = part_code;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public String getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(String brand_name) {
                this.brand_name = brand_name;
            }
        }
    }
}
