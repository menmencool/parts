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
            private ArrayList<ConfigurationBean> configuration;

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

            public ArrayList<ConfigurationBean> getConfiguration() {
                return configuration;
            }

            public void setConfiguration(ArrayList<ConfigurationBean> configuration) {
                this.configuration = configuration;
            }

            public static class ConfigurationBean {
                /**
                 * chapter : 基本参数
                 * params : [["车型名称","比亚迪S6 2011款 2.0L 手动豪华型"],["厂商指导价(元)","8.99万"],["全国4S店最低价",""],["厂商","比亚迪"],["级别","中型SUV"],["发动机","2.0L 140马力 L4"],["变速箱","5挡手动"],["长*宽*高(mm)","4810*1855*1680"],["车身结构","5门5座SUV"],["最高车速(km/h)","180"],["官方0-100km/h加速(s)","-"],["实测0-100km/h加速(s)","-"],["实测100-0km/h制动(m)","-"],["实测油耗(L/100km)","-"],["工信部综合油耗(L/100km)","8.6"],["整车质保","四年或10万公里"],["电池容量(kWh)",""]]
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

        public static class PartListBean implements Parcelable {
            /**
             * status : 0
             * part_code : 1053398900
             * sale_price : 2028.0
             * adaptable_model : S6
             * part_name : S6-6800010E_主驾驶座椅总成-豪华皮_M00666
             * purchase_price : 630.0
             * last_modified_time : 2018-03-04 16:29:49.0
             * create_time : 2018-03-04 16:29:49.0
             * part_pk : 1537014
             * comment :
             * brand_name : 比亚迪
             */

            private String status;
            private String part_code;
            private String sale_price;
            private String adaptable_model;
            private String part_name;
            private String purchase_price;
            private String last_modified_time;
            private String create_time;
            private String part_pk;
            private String comment;
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

            public String getSale_price() {
                return sale_price;
            }

            public void setSale_price(String sale_price) {
                this.sale_price = sale_price;
            }

            public String getAdaptable_model() {
                return adaptable_model;
            }

            public void setAdaptable_model(String adaptable_model) {
                this.adaptable_model = adaptable_model;
            }

            public String getPart_name() {
                return part_name;
            }

            public void setPart_name(String part_name) {
                this.part_name = part_name;
            }

            public String getPurchase_price() {
                return purchase_price;
            }

            public void setPurchase_price(String purchase_price) {
                this.purchase_price = purchase_price;
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

            public String getPart_pk() {
                return part_pk;
            }

            public void setPart_pk(String part_pk) {
                this.part_pk = part_pk;
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

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.status);
                dest.writeString(this.part_code);
                dest.writeString(this.sale_price);
                dest.writeString(this.adaptable_model);
                dest.writeString(this.part_name);
                dest.writeString(this.purchase_price);
                dest.writeString(this.last_modified_time);
                dest.writeString(this.create_time);
                dest.writeString(this.part_pk);
                dest.writeString(this.comment);
                dest.writeString(this.brand_name);
            }

            public PartListBean() {
            }

            protected PartListBean(Parcel in) {
                this.status = in.readString();
                this.part_code = in.readString();
                this.sale_price = in.readString();
                this.adaptable_model = in.readString();
                this.part_name = in.readString();
                this.purchase_price = in.readString();
                this.last_modified_time = in.readString();
                this.create_time = in.readString();
                this.part_pk = in.readString();
                this.comment = in.readString();
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