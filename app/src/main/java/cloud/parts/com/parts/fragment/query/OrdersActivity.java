package cloud.parts.com.parts.fragment.query;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

/**
 * ===================================
 * describe:
 * date:2018/3/21
 * author:zhuang
 * ===================================
 */

public class OrdersActivity extends BaseActivity {
    private ImageView include_banck;
    private TextView include_title_zhong;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_orders);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_title_zhong = (TextView) findViewById(R.id.include_title_zhong);
        include_title_zhong.setVisibility(View.VISIBLE);
        include_title_zhong.setText("订单");
        include_title_zhong.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        include_banck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
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
