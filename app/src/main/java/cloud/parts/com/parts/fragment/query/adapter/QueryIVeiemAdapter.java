package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.QueryIVetemBean;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */
public class QueryIVeiemAdapter extends BaseQuickAdapter<QueryIVetemBean.DataDicBean.PartListBean,
        BaseViewHolder> {
    public QueryIVeiemAdapter(int layoutResId, @Nullable List<QueryIVetemBean.DataDicBean
            .PartListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, QueryIVetemBean.DataDicBean.PartListBean item) {
        helper.setText(R.id.tv_vinquery_carname, item.getPart_code())
                .setText(R.id.tv_vinquery_vincode, item.getPart_name())
                .setText(R.id.tv_vinquery_sellingprice, item.getSale_price())
                .addOnClickListener(R.id.tv_vinquery_by);
    }
}
