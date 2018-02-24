package cloud.parts.com.parts.activity;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;


import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.query.InquireFragment;
import cloud.parts.com.parts.fragment.queryprice.QueryFormFragment;
import cloud.parts.com.parts.fragment.home.HomeFragment;
import cloud.parts.com.parts.fragment.me.UserFragment;
import cloud.parts.com.parts.login.user_centre.UserCentre;

public class MainActivity extends BaseActivity{
    private ArrayList<Fragment> mFragments = new ArrayList<>();
   public  static TabLayout mTabLayout;
    private FragmentTabHost tab_host;
    private Class fragments[] = {HomeFragment.class, InquireFragment.class,
            QueryFormFragment.class,UserFragment.class};

    //行驶证需要的
    public static boolean hasGotToken = false;
    @Override
    protected void initView() {
        setContentView(R.layout.home_activity);

    }

    @Override
    protected void initData() {
        mTabLayout = (TabLayout)this.findViewById(R.id.tablayout);
        TypedArray tabtitle = getResources().obtainTypedArray(R.array.tabTitles);
        TypedArray tabimg = getResources().obtainTypedArray(R.array.tabImgs);
        tab_host = (FragmentTabHost) findViewById(R.id.tabhost);
        tab_host.setup(this, getSupportFragmentManager(), R.id.home_fragment);
        setTabs(mTabLayout,this.getLayoutInflater(),tabtitle,tabimg);
        initAccessToken();
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View view) {

    }
    /**
     * @description: 设置添加Tab
     */
    private void setTabs(TabLayout tabLayout, LayoutInflater inflater, TypedArray tabTitles, TypedArray tabImgs){

        for (int i = 0; i < tabImgs.length(); i++) {
            TabLayout.Tab tab = tabLayout.newTab();
            View view = inflater.inflate(R.layout.tab_custom,null);
            tab.setCustomView(view);
            TextView tvTitle = (TextView)view.findViewById(R.id.tv_tab);
            tvTitle.setText(tabTitles.getResourceId(i, 0));
            ImageView imgTab = (ImageView) view.findViewById(R.id.img_tab);
            imgTab.setImageResource(tabImgs.getResourceId(i, 0));
            tabLayout.addTab(tab);
            TabHost.TabSpec tabSpec = tab_host.newTabSpec(i + "").setIndicator(i + "");
            tab_host.addTab(tabSpec, fragments[i], null);


        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab_host.setCurrentTab(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private long exitTime=0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == keyCode) {
            // 判断是否在两秒之内连续点击返回键，是则退出，否则不退出
            if (System.currentTimeMillis() - exitTime > 2000) {
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                // 将系统当前的时间赋值给exitTime
                exitTime = System.currentTimeMillis();

            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    //授权文件（安全模式）
    //此种身份验证方案使用授权文件获得AccessToken，缓存在本地。建议有安全考虑的开发者使用此种身份验证方式。
    private void initAccessToken() {
        OCR.getInstance().initAccessToken(new OnResultListener<AccessToken>() {
            @Override
            public void onResult(AccessToken accessToken) {
                // 调用成功，返回AccessToken对象
                String token = accessToken.getAccessToken();
                Log.e("---------------", "token:-------->" + token);
                hasGotToken = true;

            }

            @Override
            public void onError(OCRError error) {
                error.printStackTrace();
                Log.e("============", "onError:licence方式获取token失败---->" + error.getMessage());
            }
        }, this.getApplicationContext());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        UserCentre.getInstance().destroy();
    }
}
