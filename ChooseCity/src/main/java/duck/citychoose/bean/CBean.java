package duck.citychoose.bean;

import java.io.Serializable;
import java.util.List;

/**
 * ====================================================
 * 作    者：DUCK
 * 版    本：
 * 创建日期：2018/4/16 - 13:02
 * 描    述：
 * 修订历史：
 * ====================================================
 */

public class CBean implements Serializable{

    private String n;
    private List<MBean> d;

    public CBean() {
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public List<MBean> getD() {
        return d;
    }

    public void setD(List<MBean> d) {
        this.d = d;
    }
}
