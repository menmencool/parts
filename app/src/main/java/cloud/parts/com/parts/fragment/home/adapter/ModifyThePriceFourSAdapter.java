package cloud.parts.com.parts.fragment.home.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.FourSQueryBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/4/8 21:46
 */

public class ModifyThePriceFourSAdapter extends BaseQuickAdapter<FourSQueryBean.DataDicBean
        .ListBean,
        BaseViewHolder> {


    public ModifyThePriceFourSAdapter(int layoutResId, @Nullable List<FourSQueryBean.DataDicBean
            .ListBean>
            data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FourSQueryBean.DataDicBean.ListBean item) {
        EditText ed_fours_price = helper.getView(R.id.ed_fours_price);
        helper.setText(R.id.tv_fours_ffname, "编号：" + item.getFfId() + "")
                .setText(R.id.tv_fours_ffaddress, "名称：" + item.getFfBrands())
                .setText(R.id.ed_fours_price, ed_fours_price.getText().toString().trim())
                .addOnClickListener(R.id.bt_fours_xiugai);
        Button button = helper.getView(R.id.bt_fours_xiugai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "修改", Toast.LENGTH_SHORT).show();
            }
        });
    }
}