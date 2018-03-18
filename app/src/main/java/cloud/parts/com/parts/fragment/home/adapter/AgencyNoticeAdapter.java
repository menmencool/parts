package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.AgencyNoticeBean;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;
import cloud.parts.com.parts.utils.DateUtils;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/18 11:00
 */

public class AgencyNoticeAdapter extends BaseQuickAdapter<AgencyNoticeBean.DataDicBean.ListBean,
        BaseViewHolder> {


    public AgencyNoticeAdapter(int layoutResId, @Nullable List<AgencyNoticeBean.DataDicBean
            .ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AgencyNoticeBean.DataDicBean.ListBean item) {
        String dateToString = DateUtils.getDateToString(item.getNewsdate());
        helper.setText(R.id.tv_group_name, item.getNewstitle())
                .setVisible(R.id.tv_group_time, true)
                .setText(R.id.tv_group_time, dateToString);

    }
}
