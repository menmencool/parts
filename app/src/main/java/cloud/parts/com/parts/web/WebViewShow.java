package cloud.parts.com.parts.web;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

public class WebViewShow extends BaseActivity {


    private WebView webView;
    private ImageView include_banck;
    private TextView include_title_zhong;
    private String urls="http://123.57.141.113:8080/PartsCloud/api/displayPartByPartCode?partCode=";
    @Override
    protected void initView() {
        setContentView(R.layout.recommend_webview);
        webView = (WebView) findViewById(R.id.re_web_view);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_title_zhong = (TextView) findViewById(R.id.include_title_zhong);
        include_title_zhong.setVisibility(View.VISIBLE);
        include_title_zhong.setText("详情内容");
        //脚本
        webView.getSettings().setJavaScriptEnabled(true);
        Intent intent = getIntent();
        String code = intent.getStringExtra("code");
        webView.loadUrl(urls+code);
        //缩放
        webView.getSettings().setBuiltInZoomControls(true);
        //可以访问的文件
        webView.getSettings().setAllowFileAccess(true);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        include_banck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public void onClick(View view) {

    }
}