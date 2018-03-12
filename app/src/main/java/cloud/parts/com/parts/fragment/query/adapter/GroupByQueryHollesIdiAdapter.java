package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/12 21:03
 */

public class GroupByQueryHollesIdiAdapter extends BaseQuickAdapter<GroupByQueryBean.DataDicBean
        .ListBean.SubGroupsBean.GraphGroupsBean,
        BaseViewHolder> {


    public GroupByQueryHollesIdiAdapter(int layoutResId, @Nullable List<GroupByQueryBean
            .DataDicBean.ListBean.SubGroupsBean.GraphGroupsBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, GroupByQueryBean.DataDicBean.ListBean
            .SubGroupsBean.GraphGroupsBean item) {
        helper.setText(R.id.tv_group_name, item.getGraph_name());

    }
}
