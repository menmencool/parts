package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

/**
 * describe:
 * date:2017/12/21
 * author:zhuang
 */

public class ScanCodeActivity extends BaseActivity {

    private ImageView include_banck;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_sancode);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.include_banck:
                finish();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}
