package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/3/18 12:41
 */

public class ContentDisplayActivity extends BaseActivity {
    private ImageView include_banck;
    private TextView include_titles;
    private TextView tv;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_contentdisplay);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_titles = (TextView) findViewById(R.id.include_titles);
        include_titles.setVisibility(View.VISIBLE);
        include_titles.setText("详情内容");
        tv = (TextView) findViewById(R.id.tv);
    }

    @Override
    protected void initData() {
        String content = getIntent().getStringExtra("content");
        tv.setText(content);
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
    }
}
