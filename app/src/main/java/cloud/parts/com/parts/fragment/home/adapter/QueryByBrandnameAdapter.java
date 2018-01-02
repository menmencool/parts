package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.QueryByBrandnameBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/1/2 14:09
 */

public class QueryByBrandnameAdapter extends BaseQuickAdapter<QueryByBrandnameBean.DataDicBean.MatchPartsBean,
        BaseViewHolder> {


    public QueryByBrandnameAdapter(int layoutResId, @Nullable List<QueryByBrandnameBean.DataDicBean.MatchPartsBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, QueryByBrandnameBean.DataDicBean.MatchPartsBean item) {
        helper.setText(R.id.tv_vinquery_carname, item.getPartname())
                .setText(R.id.tv_vinquery_vincode, item.getPartcode())
                .setText(R.id.tv_vinquery_purchasingprice, item.getSaleprice());
        helper.addOnClickListener(R.id.tv_vinquery_by);

    }
}

