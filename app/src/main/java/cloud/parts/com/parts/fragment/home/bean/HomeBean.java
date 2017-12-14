package cloud.parts.com.parts.fragment.home.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/14 20:54
 */

public class HomeBean {

    /**
     * errorcode : 0
     * errormsg :
     * dataDic : {"banner":[{"imgurl":"https://www.autohome.com
     * .cn/img/?img=newsdfs/g12/M04/0D/FD/autohomecar__wKjBy1onBlKASqMHAA3e5ox-HPE499.jpg",
     * "contenturl":"https://www.autohome.com.cn/drive/201712/910513.html#pvareaid=2023104",
     * "title":"讴歌测试"},{"imgurl":"https://www.autohome.com
     * .cn/img/?img=newsdfs/g22/M0C/E7/FB/autohomecar__wKgFW1onZyqAd8U5ABFwZRbqUVw563.jpg",
     * "contenturl":"https://www.autohome.com.cn/news/201712/910527.html#pvareaid=2023114",
     * "title":"奥迪测试"}],"marquee":[{"content":"公告测试1"},{"content":"公告测试2"}],"tips":"3"}
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
         * banner : [{"imgurl":"https://www.autohome.com
         * .cn/img/?img=newsdfs/g12/M04/0D/FD/autohomecar__wKjBy1onBlKASqMHAA3e5ox-HPE499.jpg",
         * "contenturl":"https://www.autohome.com.cn/drive/201712/910513.html#pvareaid=2023104",
         * "title":"讴歌测试"},{"imgurl":"https://www.autohome.com
         * .cn/img/?img=newsdfs/g22/M0C/E7/FB/autohomecar__wKgFW1onZyqAd8U5ABFwZRbqUVw563.jpg",
         * "contenturl":"https://www.autohome.com.cn/news/201712/910527.html#pvareaid=2023114",
         * "title":"奥迪测试"}]
         * marquee : [{"content":"公告测试1"},{"content":"公告测试2"}]
         * tips : 3
         */

        private String tips;
        private List<BannerBean> banner;
        private List<MarqueeBean> marquee;

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<MarqueeBean> getMarquee() {
            return marquee;
        }

        public void setMarquee(List<MarqueeBean> marquee) {
            this.marquee = marquee;
        }

        public static class BannerBean {
            /**
             * imgurl : https://www.autohome.com
             * .cn/img/?img=newsdfs/g12/M04/0D/FD/autohomecar__wKjBy1onBlKASqMHAA3e5ox-HPE499.jpg
             * contenturl : https://www.autohome.com.cn/drive/201712/910513.html#pvareaid=2023104
             * title : 讴歌测试
             */

            private String imgurl;
            private String contenturl;
            private String title;

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public String getContenturl() {
                return contenturl;
            }

            public void setContenturl(String contenturl) {
                this.contenturl = contenturl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class MarqueeBean {
            /**
             * content : 公告测试1
             */

            private String content;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
