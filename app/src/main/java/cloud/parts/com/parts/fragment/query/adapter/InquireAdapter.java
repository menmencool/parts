package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.db.DBDataBean;
import cloud.parts.com.parts.fragment.home.bean.DetailsBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/26 14:18
 */

public class InquireAdapter extends BaseQuickAdapter<DBDataBean, BaseViewHolder> {

    public InquireAdapter(int layoutResId, @Nullable List<DBDataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DBDataBean item) {
        helper.setText(R.id.tv_inquire_carname, item.getCxmc2())
                .setText(R.id.tv_inquire_vincode, item.getVincode())
                .setText(R.id.tv_inquire_time, item.getTime());
    }

}
