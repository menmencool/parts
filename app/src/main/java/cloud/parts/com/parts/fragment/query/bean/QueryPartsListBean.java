package cloud.parts.com.parts.fragment.query.bean;

import java.util.List;

/**
 * ===================================
 * describe:
 * date:2018/3/13
 * author:zhuang
 * ===================================
 */

public class QueryPartsListBean {

    /**
     * status : 0
     * errmsg :
     * dataDic : {"list":[{"part_name":"十字槽盘头自攻螺钉_ST4.8×13","part_pk":"1524227","purchase_price":"0.1","sale_price":"1.0","last_modified_time":"2018-03-04 16:28:57.0","adaptable_model":"F0","create_time":"2018-03-04 16:28:57.0","part_code":"1008299000","comment":"","brand_name":"比亚迪"},{"part_name":"BYDQ832B0515_叶子片卡扣_黑色","part_pk":"1529310","purchase_price":"0.7","sale_price":"2.0","last_modified_time":"2018-03-04 16:29:19.0","adaptable_model":"F0,M6,思锐","create_time":"2018-03-04 16:29:19.0","part_code":"1018911000","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702112_前侧面内衬_M00666","part_pk":"1531462","purchase_price":"2.3","sale_price":"8.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023673700","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702113_左中顶棚内衬_M00666","part_pk":"1531463","purchase_price":"2.3","sale_price":"8.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023673800","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702114_右中顶棚内衬_M00666","part_pk":"1531464","purchase_price":"2.3","sale_price":"8.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023673900","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702115_左后顶棚内衬_M00666","part_pk":"1531465","purchase_price":"2.9","sale_price":"10.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023674000","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702116_右后顶棚内衬_M00666","part_pk":"1531466","purchase_price":"4.5","sale_price":"7.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023674100","comment":"新增临时冻结，订购请下手工订单或传真订购","brand_name":"比亚迪"},{"part_name":"LK-8204117_遮阳板固定支座_M00666","part_pk":"1531469","purchase_price":"1.9","sale_price":"9.0","last_modified_time":"2018-03-04 16:29:25.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:25.0","part_code":"1023674400","comment":"","brand_name":"比亚迪"},{"part_name":"BYDQ832B0515_叶子片卡扣_灰色","part_pk":"1534105","purchase_price":"0.3","sale_price":"1.0","last_modified_time":"2018-03-04 16:29:32.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:32.0","part_code":"1027957300","comment":"安装于顶棚总成","brand_name":"比亚迪"},{"part_name":"LK-8204110-C1_左遮阳板总成_M00666","part_pk":"1534611","purchase_price":"23.0","sale_price":"33.0","last_modified_time":"2018-03-04 16:29:40.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:40.0","part_code":"1031187000","comment":"","brand_name":"比亚迪"},{"part_name":"LK-8204120-C1_右遮阳板总成_M00666","part_pk":"1534612","purchase_price":"22.3","sale_price":"33.0","last_modified_time":"2018-03-04 16:29:40.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:40.0","part_code":"1031187100","comment":"","brand_name":"比亚迪"},{"part_name":"LK-5702111A-C1_顶棚本体_M00666","part_pk":"1535051","purchase_price":"227.0","sale_price":"330.0","last_modified_time":"2018-03-04 16:29:40.0","adaptable_model":"F0","create_time":"2018-03-04 16:29:40.0","part_code":"1034565500","comment":"","brand_name":"比亚迪"}]}
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
             * part_name : 十字槽盘头自攻螺钉_ST4.8×13
             * part_pk : 1524227
             * purchase_price : 0.1
             * sale_price : 1.0
             * last_modified_time : 2018-03-04 16:28:57.0
             * adaptable_model : F0
             * create_time : 2018-03-04 16:28:57.0
             * part_code : 1008299000
             * comment :
             * brand_name : 比亚迪
             */

            private String part_name;
            private String part_pk;
            private String purchase_price;
            private String sale_price;
            private String last_modified_time;
            private String adaptable_model;
            private String create_time;
            private String part_code;
            private String comment;
            private String brand_name;

            @Override
            public String toString() {
                return "ListBean{" +
                        "part_name='" + part_name + '\'' +
                        ", part_pk='" + part_pk + '\'' +
                        ", purchase_price='" + purchase_price + '\'' +
                        ", sale_price='" + sale_price + '\'' +
                        ", last_modified_time='" + last_modified_time + '\'' +
                        ", adaptable_model='" + adaptable_model + '\'' +
                        ", create_time='" + create_time + '\'' +
                        ", part_code='" + part_code + '\'' +
                        ", comment='" + comment + '\'' +
                        ", brand_name='" + brand_name + '\'' +
                        '}';
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
