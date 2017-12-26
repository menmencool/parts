package cloud.parts.com.parts.db;

import org.litepal.crud.DataSupport;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/26 11:37
 */

public class DBDataBean extends DataSupport {
    private String vincode;
    private String cxmc2;
    private String time;

    public String getVincode() {
        return vincode;
    }

    public void setVincode(String vincode) {
        this.vincode = vincode;
    }

    public String getCxmc2() {
        return cxmc2;
    }

    public void setCxmc2(String cxmc2) {
        this.cxmc2 = cxmc2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
