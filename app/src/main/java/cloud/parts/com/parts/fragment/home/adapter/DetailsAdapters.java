package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.DetailsBeans;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */

public class DetailsAdapters extends BaseQuickAdapter<DetailsBeans.DataDicBean.MatchPartsBean,
        BaseViewHolder> {


    public DetailsAdapters(int layoutResId, @Nullable List<DetailsBeans.DataDicBean.MatchPartsBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DetailsBeans.DataDicBean.MatchPartsBean item) {
        helper.setText(R.id.tv_vinquery_carname, item.getPartcode())
                .setText(R.id.tv_vinquery_vincode, item.getPartname())
                .setText(R.id.tv_vinquery_purchasingprice, item.getSaleprice() + "元");

    }
}
