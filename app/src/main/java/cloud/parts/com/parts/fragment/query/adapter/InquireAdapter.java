package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.HistoriBean;
import cloud.parts.com.parts.utils.DateUtils;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/26 14:18
 */

public class InquireAdapter extends BaseQuickAdapter<HistoriBean.DataDicBean.ListBean, BaseViewHolder> {

    public InquireAdapter(int layoutResId, @Nullable List<HistoriBean.DataDicBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HistoriBean.DataDicBean.ListBean item) {
        String stringDate = DateUtils.getStringDate(item.getLastupdateTime());
        helper.setText(R.id.tv_inquire_carname, item.getHistoryno())
                .setText(R.id.tv_inquire_vincode, item.getVins())
                .setText(R.id.tv_inquire_time, stringDate);
    }

}
