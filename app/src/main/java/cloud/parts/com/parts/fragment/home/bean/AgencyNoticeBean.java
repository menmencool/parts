package cloud.parts.com.parts.fragment.home.bean;

import java.util.List;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/18 10:51
 */

public class AgencyNoticeBean {

    /**
     * status : 0
     * errmsg :
     * dataDic : {"list":[{"newkind":"优惠信息",
     * "newscontent":"PHA
     * +PHNwYW4gc3R5bGU9ImNvbG9yOiByZ2IoNTEsIDUxLCA1MSk7IGZvbnQtZmFtaWx5OiBBcmlhbCwgJnF1b3Q7TWljcm9zb2Z0IFlhSGVpJnF1b3Q7OyBmb250LXNpemU6IDE0cHg7IGJhY2tncm91bmQtY29sb3I6IHJnYigyNTUsIDI1NSwgMjU1KTsiPkhUQyBVMTIg6YWN572u5pud5YWJ77yM6K+l5py66YeH55SoIDYg6Iux5a+4IFF1YWQgSEQg5YiG6L6o546HIDE4OjkgU3VwZXIgTENEIOWxj+W5le+8jOaQrei9vemrmOmAmumqgem+mSA4NDUg5aSE55CG5Zmo77yMNkdCICsgMTI4R0LvvIzlkI7nva4gMTIwMCDkuIcrIDgwMCDkuIflg4/ntKDlj4zmkYTvvIzliY3nva4gMTIwMCDkuIflg4/ntKDvvIwgMzk4MG1BaCDnlLXmsaDvvIxRQzMuMCDlv6vlhYXvvIzmlK/mjIEgSVA2OCDpmLLmsLTpmLLlsJjvvIzlj6/og73kvJrlhoXnva7pqoHpvplYMjAgTFRFIOiKr+eJh+e7hO+8jOaUr+aMgSBDYXQuMTjvvIznkIborrrkuIvovb3pgJ/luqYgMS4yR2JwcygxNTBNQi9zKe+8jOWUruS7t+S4uiA4ODAg576O5YWD77yM57qm5ZCI5Lq65rCR5biBIDU1NzUg5YWD44CCPC9zcGFuPjwvcD48cD48c3BhbiBzdHlsZT0iY29sb3I6IHJnYig1MSwgNTEsIDUxKTsgZm9udC1mYW1pbHk6IEFyaWFsLCAmcXVvdDtNaWNyb3NvZnQgWWFIZWkmcXVvdDs7IGZvbnQtc2l6ZTogMTRweDsgYmFja2dyb3VuZC1jb2xvcjogcmdiKDI1NSwgMjU1LCAyNTUpOyI+PC9zcGFuPjwvcD48cD48aW1nIHNyYz0iL1BhcnRzQ2xvdWQvYXBpL3ZpZXdJbWFnZT9maWxlPS9maWxldXBsb2FkL2ltZy8yMDE4MDMwNC8xNTIwMTU0MjY5Mzk1MDI0NDQ0LmpwZyIgdGl0bGU9IjE1MjAxNTQyNjkzOTUwMjQ0NDQuanBnIi8+PC9wPjxwPjxpbWcgc3JjPSIvUGFydHNDbG91ZC9hcGkvdmlld0ltYWdlP2ZpbGU9L2ZpbGV1cGxvYWQvaW1nLzIwMTgwMzA0LzE1MjAxNTQyNjk0NDEwNDYyMTUuanBnIiB0aXRsZT0iMTUyMDE1NDI2OTQ0MTA0NjIxNS5qcGciLz48L3A+PHA+PHNwYW4gc3R5bGU9ImNvbG9yOiByZ2IoNTEsIDUxLCA1MSk7IGZvbnQtZmFtaWx5OiBBcmlhbCwgJnF1b3Q7TWljcm9zb2Z0IFlhSGVpJnF1b3Q7OyBmb250LXNpemU6IDE0cHg7IGJhY2tncm91bmQtY29sb3I6IHJnYigyNTUsIDI1NSwgMjU1KTsiPjxici8+PC9zcGFuPjxici8+PC9wPg==","newsdate":1520154075000,"newsid":6,"newsorgname":"中华保险","newstitle":"测试by YR 180304","organizationid":2}]}
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
             * newkind : 优惠信息
             * newscontent :
             * PHA+PHNwYW4gc3R5bGU9ImNvbG9yOiByZ2IoNTEsIDUxLCA1MSk7IGZvbnQtZmFtaWx5OiBBcmlhbCwgJnF1b3Q7TWljcm9zb2Z0IFlhSGVpJnF1b3Q7OyBmb250LXNpemU6IDE0cHg7IGJhY2tncm91bmQtY29sb3I6IHJnYigyNTUsIDI1NSwgMjU1KTsiPkhUQyBVMTIg6YWN572u5pud5YWJ77yM6K+l5py66YeH55SoIDYg6Iux5a+4IFF1YWQgSEQg5YiG6L6o546HIDE4OjkgU3VwZXIgTENEIOWxj+W5le+8jOaQrei9vemrmOmAmumqgem+mSA4NDUg5aSE55CG5Zmo77yMNkdCICsgMTI4R0LvvIzlkI7nva4gMTIwMCDkuIcrIDgwMCDkuIflg4/ntKDlj4zmkYTvvIzliY3nva4gMTIwMCDkuIflg4/ntKDvvIwgMzk4MG1BaCDnlLXmsaDvvIxRQzMuMCDlv6vlhYXvvIzmlK/mjIEgSVA2OCDpmLLmsLTpmLLlsJjvvIzlj6/og73kvJrlhoXnva7pqoHpvplYMjAgTFRFIOiKr+eJh+e7hO+8jOaUr+aMgSBDYXQuMTjvvIznkIborrrkuIvovb3pgJ/luqYgMS4yR2JwcygxNTBNQi9zKe+8jOWUruS7t+S4uiA4ODAg576O5YWD77yM57qm5ZCI5Lq65rCR5biBIDU1NzUg5YWD44CCPC9zcGFuPjwvcD48cD48c3BhbiBzdHlsZT0iY29sb3I6IHJnYig1MSwgNTEsIDUxKTsgZm9udC1mYW1pbHk6IEFyaWFsLCAmcXVvdDtNaWNyb3NvZnQgWWFIZWkmcXVvdDs7IGZvbnQtc2l6ZTogMTRweDsgYmFja2dyb3VuZC1jb2xvcjogcmdiKDI1NSwgMjU1LCAyNTUpOyI+PC9zcGFuPjwvcD48cD48aW1nIHNyYz0iL1BhcnRzQ2xvdWQvYXBpL3ZpZXdJbWFnZT9maWxlPS9maWxldXBsb2FkL2ltZy8yMDE4MDMwNC8xNTIwMTU0MjY5Mzk1MDI0NDQ0LmpwZyIgdGl0bGU9IjE1MjAxNTQyNjkzOTUwMjQ0NDQuanBnIi8+PC9wPjxwPjxpbWcgc3JjPSIvUGFydHNDbG91ZC9hcGkvdmlld0ltYWdlP2ZpbGU9L2ZpbGV1cGxvYWQvaW1nLzIwMTgwMzA0LzE1MjAxNTQyNjk0NDEwNDYyMTUuanBnIiB0aXRsZT0iMTUyMDE1NDI2OTQ0MTA0NjIxNS5qcGciLz48L3A+PHA+PHNwYW4gc3R5bGU9ImNvbG9yOiByZ2IoNTEsIDUxLCA1MSk7IGZvbnQtZmFtaWx5OiBBcmlhbCwgJnF1b3Q7TWljcm9zb2Z0IFlhSGVpJnF1b3Q7OyBmb250LXNpemU6IDE0cHg7IGJhY2tncm91bmQtY29sb3I6IHJnYigyNTUsIDI1NSwgMjU1KTsiPjxici8+PC9zcGFuPjxici8+PC9wPg==
             * newsdate : 1520154075000
             * newsid : 6
             * newsorgname : 中华保险
             * newstitle : 测试by YR 180304
             * organizationid : 2
             */

            private String newkind;
            private String newscontent;
            private long newsdate;
            private int newsid;
            private String newsorgname;
            private String newstitle;
            private int organizationid;

            public String getNewkind() {
                return newkind;
            }

            public void setNewkind(String newkind) {
                this.newkind = newkind;
            }

            public String getNewscontent() {
                return newscontent;
            }

            public void setNewscontent(String newscontent) {
                this.newscontent = newscontent;
            }

            public long getNewsdate() {
                return newsdate;
            }

            public void setNewsdate(long newsdate) {
                this.newsdate = newsdate;
            }

            public int getNewsid() {
                return newsid;
            }

            public void setNewsid(int newsid) {
                this.newsid = newsid;
            }

            public String getNewsorgname() {
                return newsorgname;
            }

            public void setNewsorgname(String newsorgname) {
                this.newsorgname = newsorgname;
            }

            public String getNewstitle() {
                return newstitle;
            }

            public void setNewstitle(String newstitle) {
                this.newstitle = newstitle;
            }

            public int getOrganizationid() {
                return organizationid;
            }

            public void setOrganizationid(int organizationid) {
                this.organizationid = organizationid;
            }
        }
    }
}
