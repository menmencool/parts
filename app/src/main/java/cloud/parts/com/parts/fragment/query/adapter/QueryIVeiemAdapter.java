package cloud.parts.com.parts.fragment.query.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.bean.DetailsBeans;
import cloud.parts.com.parts.fragment.query.bean.QueryIVetemBean;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */
public class QueryIVeiemAdapter extends BaseQuickAdapter<DetailsBeans.DataDicBean.ListBean,
        BaseViewHolder> {
    public QueryIVeiemAdapter(int layoutResId, @Nullable List<DetailsBeans.DataDicBean.ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DetailsBeans.DataDicBean.ListBean item) {
        if (item.getStatus().equals("0")) {
            helper.setText(R.id.tv_vinquery_carname, item.getPart_code())
                    .setText(R.id.tv_vinquery_vincode, item.getPart_name())
                    .setText(R.id.tv_vinquery_sellingprice, item.getSale_price())
                    .setVisible(R.id.tv_query_bao,false)
                    .setVisible(R.id.tv_query_ti,false)
                    .setVisible(R.id.tv_query_jing,false)
                    .addOnClickListener(R.id.tv_vinquery_by)
                    .addOnClickListener(R.id.tv_vinquery_delete);
        }else {
            helper.setText(R.id.tv_vinquery_carname, item.getPart_code())
                    .setText(R.id.tv_vinquery_vincode, item.getPart_name())
                    .setText(R.id.tv_vinquery_sellingprice, item.getSale_price())
                    .setVisible(R.id.tv_query_bao,true)
                    .setVisible(R.id.tv_query_ti,true)
                    .setVisible(R.id.tv_query_jing,true)
                    .addOnClickListener(R.id.tv_vinquery_by)
                    .addOnClickListener(R.id.tv_vinquery_delete);
        }
    }
}
