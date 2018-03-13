package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.QueryPartsListBean;

/**
 * ===================================
 * describe:
 * date:2018/3/13
 * author:zhuang
 * ===================================
 */

public class QueryPartsListAdaptre extends BaseQuickAdapter<QueryPartsListBean.DataDicBean.ListBean,
        BaseViewHolder> {
    public QueryPartsListAdaptre(int layoutResId, @Nullable List<QueryPartsListBean.DataDicBean.ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper,QueryPartsListBean.DataDicBean.ListBean item) {
        helper.setText(R.id.tv_vinquery_carname, item.getPart_code())
                .setText(R.id.tv_vinquery_vincode, item.getPart_name())
                .setText(R.id.tv_vinquery_purchasingprice, item.getSale_price())
                .addOnClickListener(R.id.tv_vinquery_by);
    }
}
