package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.FourSQueryBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/4/8 20:37
 */

public class FourSQueryAdapter extends BaseQuickAdapter<FourSQueryBean.DataDicBean.ListBean,
        BaseViewHolder> {


    public FourSQueryAdapter(int layoutResId, @Nullable List<FourSQueryBean.DataDicBean.ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FourSQueryBean.DataDicBean.ListBean item) {
        helper.setText(R.id.tv_fours_ffname, item.getFfName())
                .setText(R.id.tv_fours_ffaddress, item.getFfAddress());

    }
}