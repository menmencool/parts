package cloud.parts.com.parts.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;


import java.util.Stack;

/**
 * 类用途：base类
 */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 用来保存所有已打开的Activity
     */
    private static Stack<Activity> listActivity = new Stack<Activity>();
    private InputMethodManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        Window window = getWindow();
//设置透明状态栏,这样才能让 ContentView 向上
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

//需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//设置状态栏颜色
//        window.setStatusBarColor(getColor(android.R.color.transparent));

        ViewGroup mContentView = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);
        View mChildView = mContentView.getChildAt(0);
        if (mChildView != null) {
            //注意不是设置 ContentView 的 FitsSystemWindows, 而是设置 ContentView 的第一个子 View . 使其不为系统 View 预留空间.
            ViewCompat.setFitsSystemWindows(mChildView, false);
        }


        //隐藏键盘
//        HideUtil.init(this);
        // 初始化ui
        initView();
        // 初始化数据
        initData();
        // 添加监听器
        initListener();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (getCurrentFocus() != null && getCurrentFocus().getWindowToken() != null) {
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
        return super.onTouchEvent(event);
    }

    // 初始化ui
    protected abstract void initView();

    // 初始化数据
    protected abstract void initData();

    // 添加监听器
    protected abstract void initListener();

    /**
     * 关闭所有(前台、后台)Activity,注意：请已BaseActivity为父类
     */
    protected static void finishAll() {
        int len = listActivity.size();
        for (int i = 0; i < len; i++) {
            Activity activity = listActivity.pop();
            activity.finish();
        }
    }

    /***************** 双击退出程序 ************************************************/


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

}