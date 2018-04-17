package duck.citychoose.bean;

import java.io.Serializable;
import java.util.List;

import duck.citychoose.picker_view.model.IPickerViewData;

/**
 * ====================================================
 * 作    者：DUCK
 * 版    本：
 * 创建日期：2018/4/16 - 12:59
 * 描    述：
 * 修订历史：
 * ====================================================
 */

public class CityBean implements Serializable, IPickerViewData {

    private String p;
    private List<CBean> c;

    public CityBean() {
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public List<CBean> getC() {
        return c;
    }

    public void setC(List<CBean> c) {
        this.c = c;
    }

    @Override
    public String getPickerViewText() {
        return p;
    }
}
