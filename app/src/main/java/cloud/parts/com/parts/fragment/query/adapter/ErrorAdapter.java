package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/28 14:17
 */

public class ErrorAdapter extends BaseQuickAdapter<String,
        BaseViewHolder> {


    public ErrorAdapter(int layoutResId, @Nullable List<String>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_vinquery_carname, item.toString());
    }
}