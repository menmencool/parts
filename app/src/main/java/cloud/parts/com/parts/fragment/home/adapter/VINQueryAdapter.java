package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.VINQueryBean;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */

public class VINQueryAdapter extends BaseQuickAdapter<VINQueryBean.DataDicBean, BaseViewHolder> {


    public VINQueryAdapter(int layoutResId, @Nullable ArrayList<VINQueryBean.DataDicBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, VINQueryBean.DataDicBean item) {
        helper.setText(R.id.tv_vinquery_carname, item.getModel().getCxmc2());
        helper.setText(R.id.tv_vinquery_vincode, item.getVincode());
        helper.setText(R.id.tv_vinquery_querytime, "2018.01.01");

    }
}
