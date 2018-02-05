package cloud.parts.com.parts.fragment.home.bean;

import java.util.List;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */

public class DetailsBean {


    /**
     * errorcode : 0
     * errormsg :
     * dataDic : {"vincode":"5UXZV4C56D0B02465","model":{"model_pk":"1","brand_name":"宝马",
     * "ppid":"15","ppszm":"B","ppmc":"宝马","cxzszm":"B","cxid":"472","cxzmc":"宝马(进口)",
     * "cxiszm":"B","cximc":"宝马7系","cxiid":"153","cxmc":"2004款 730Li","cxmc2":"宝马 宝马7系 2004款
     * 730Li","nf":"2004","zt":"停售","cjzdjg":"87.00万","sszdjg":"","cs":"宝马(进口)","jb":"大型车",
     * "fdj":"3.0L 231马力 L6","bsx":"手自一体变速箱(AT)","fdjxh":"","plml":"2979","pll":"3",
     * "jqxs":"自然吸气","qgplxs":"L","qggs":"6","qmgs":"4","ysb":"10.2","rlxs":"汽油","rybh":"95号",
     * "gyfs":"多点电喷","ggcl":"铝","gtcl":"铝镁合金","hbbz":"欧III","jc":"6挡手自一体","dwgs":"6",
     * "bsxlx":"手自一体变速箱(AT)","qdfs":"前置后驱","sqxs":"-","imgurl":"","configuration":[]},
     * "hotparts":[{"partpk":"1","brandname":"宝马","partcode":"12345678","saleprice":"100.00",
     * "partname":"大灯","purchaseprice":"120.00"},{"partpk":"2","brandname":"宝马",
     * "partcode":"12345679","saleprice":"1000.00","partname":"轮胎","purchaseprice":"1200.00"}]}
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
        /**
         * vincode : 5UXZV4C56D0B02465
         * model : {"model_pk":"1","brand_name":"宝马","ppid":"15","ppszm":"B","ppmc":"宝马",
         * "cxzszm":"B","cxid":"472","cxzmc":"宝马(进口)","cxiszm":"B","cximc":"宝马7系","cxiid":"153",
         * "cxmc":"2004款 730Li","cxmc2":"宝马 宝马7系 2004款 730Li","nf":"2004","zt":"停售",
         * "cjzdjg":"87.00万","sszdjg":"","cs":"宝马(进口)","jb":"大型车","fdj":"3.0L 231马力 L6",
         * "bsx":"手自一体变速箱(AT)","fdjxh":"","plml":"2979","pll":"3","jqxs":"自然吸气","qgplxs":"L",
         * "qggs":"6","qmgs":"4","ysb":"10.2","rlxs":"汽油","rybh":"95号","gyfs":"多点电喷","ggcl":"铝",
         * "gtcl":"铝镁合金","hbbz":"欧III","jc":"6挡手自一体","dwgs":"6","bsxlx":"手自一体变速箱(AT)",
         * "qdfs":"前置后驱","sqxs":"-","imgurl":"","configuration":[]}
         * hotparts : [{"partpk":"1","brandname":"宝马","partcode":"12345678","saleprice":"100.00",
         * "partname":"大灯","purchaseprice":"120.00"},{"partpk":"2","brandname":"宝马",
         * "partcode":"12345679","saleprice":"1000.00","partname":"轮胎","purchaseprice":"1200.00"}]
         */

        private String vincode;
        private ModelBean model;
        private List<HotpartsBean> hotparts;

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

        public List<HotpartsBean> getHotparts() {
            return hotparts;
        }

        public void setHotparts(List<HotpartsBean> hotparts) {
            this.hotparts = hotparts;
        }

        public static class ModelBean {
            /**
             * model_pk : 1
             * brand_name : 宝马
             * ppid : 15
             * ppszm : B
             * ppmc : 宝马
             * cxzszm : B
             * cxid : 472
             * cxzmc : 宝马(进口)
             * cxiszm : B
             * cximc : 宝马7系
             * cxiid : 153
             * cxmc : 2004款 730Li
             * cxmc2 : 宝马 宝马7系 2004款 730Li
             * nf : 2004
             * zt : 停售
             * cjzdjg : 87.00万
             * sszdjg :
             * cs : 宝马(进口)
             * jb : 大型车
             * fdj : 3.0L 231马力 L6
             * bsx : 手自一体变速箱(AT)
             * fdjxh :
             * plml : 2979
             * pll : 3
             * jqxs : 自然吸气
             * qgplxs : L
             * qggs : 6
             * qmgs : 4
             * ysb : 10.2
             * rlxs : 汽油
             * rybh : 95号
             * gyfs : 多点电喷
             * ggcl : 铝
             * gtcl : 铝镁合金
             * hbbz : 欧III
             * jc : 6挡手自一体
             * dwgs : 6
             * bsxlx : 手自一体变速箱(AT)
             * qdfs : 前置后驱
             * sqxs : -
             * imgurl :
             * configuration : []
             */

            private String model_pk;
            private String brand_name;
            private String ppid;
            private String ppszm;
            private String ppmc;
            private String cxzszm;
            private String cxid;
            private String cxzmc;
            private String cxiszm;
            private String cximc;
            private String cxiid;
            private String cxmc;
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
            private List<?> configuration;

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

            public String getCxid() {
                return cxid;
            }

            public void setCxid(String cxid) {
                this.cxid = cxid;
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

            public List<?> getConfiguration() {
                return configuration;
            }

            public void setConfiguration(List<?> configuration) {
                this.configuration = configuration;
            }
        }

        public static class HotpartsBean {
            /**
             * partpk : 1
             * brandname : 宝马
             * partcode : 12345678
             * saleprice : 100.00
             * partname : 大灯
             * purchaseprice : 120.00
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
