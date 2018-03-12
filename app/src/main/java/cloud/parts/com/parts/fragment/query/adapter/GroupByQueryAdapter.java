package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.GroupByQueryBean;

/**
 * ===================================
 * describe:
 * date:2018/3/12
 * author:zhuang
 * ===================================
 */

public class GroupByQueryAdapter extends BaseQuickAdapter<GroupByQueryBean.DataDicBean.ListBean,
        BaseViewHolder> {


    public GroupByQueryAdapter(int layoutResId, @Nullable List<GroupByQueryBean.DataDicBean.ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper,GroupByQueryBean.DataDicBean.ListBean item) {
            helper.setText(R.id.tv_group_name, item.getGroup_name());

    }
}
