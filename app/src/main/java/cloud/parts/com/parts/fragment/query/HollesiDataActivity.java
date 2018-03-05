package cloud.parts.com.parts.fragment.query;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.query.bean.QueryIVetemBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/4 19:48
 */

public class HollesiDataActivity extends BaseActivity {


    private TextView mTvHollesiBreandName;
    private TextView mTvHollesiPartName;
    private TextView mTvHollesiPurchasePrice;
    private TextView mTvHollesiSalePrice;
    private TextView mTvHollesiLastModifiedTime;
    private TextView mTvHollesiCreateTime;
    private TextView mTvHollesiPartCode;

    @Override
    protected void initView() {
        setContentView(R.layout.hollesidata_activity);
        mTvHollesiBreandName = (TextView) findViewById(R.id.tv_hollesi_breand_name);
        mTvHollesiPartName = (TextView) findViewById(R.id.tv_hollesi_part_name);
        mTvHollesiPurchasePrice = (TextView) findViewById(R.id.tv_hollesi_purchase_price);
        mTvHollesiSalePrice = (TextView) findViewById(R.id.tv_hollesi_sale_price);
        mTvHollesiLastModifiedTime = (TextView) findViewById(R.id.tv_hollesi_last_modified_time);
        mTvHollesiCreateTime = (TextView) findViewById(R.id.tv_hollesi_create_time);
        mTvHollesiPartCode = (TextView) findViewById(R.id.tv_hollesi_part_code);
    }

    @Override
    protected void initData() {
        ArrayList<QueryIVetemBean.DataDicBean.PartListBean> partList = getIntent()
                .getParcelableArrayListExtra("partList");
        for (int i = 0; i <partList.size() ; i++) {
            mTvHollesiBreandName.setText(partList.get(i).getBrand_name());
            mTvHollesiPartName.setText(partList.get(i).getPart_name());
            mTvHollesiPurchasePrice.setText(partList.get(i).getPurchase_price());
            mTvHollesiSalePrice.setText(partList.get(i).getSale_price());
            mTvHollesiLastModifiedTime.setText(partList.get(i).getLast_modified_time());
            mTvHollesiCreateTime.setText(partList.get(i).getCreate_time());
            mTvHollesiPartCode.setText(partList.get(i).getPart_code());
        }


    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}