package cloud.parts.com.parts;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

import cloud.parts.com.parts.base.BaseActivity;

public class MainActivity extends BaseActivity{
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private int[] tabTitlees = {R.string.title_home, R.string.title_dashboard, R.string.title_4s, R.string.title_mine};
    private int[] tabImgs = {R.drawable.home_tb3x, R.drawable.inquiry3x, R.drawable.service3x, R.drawable.mine3x};
    TabLayout mTabLayout;
    @Override
    protected void initView() {
        setContentView(R.layout.home_activity);

    }

    @Override
    protected void initData() {
        mTabLayout = (TabLayout)this.findViewById(R.id.tablayout);
        setTabs(mTabLayout,this.getLayoutInflater(),tabTitlees,tabImgs);


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
    private void setTabs(TabLayout tabLayout, LayoutInflater inflater, int[] tabTitlees, int[] tabImgs){
        for (int i = 0; i < tabImgs.length; i++) {
            TabLayout.Tab tab = tabLayout.newTab();
            View view = inflater.inflate(R.layout.tab_custom,null);
            tab.setCustomView(view);

            TextView tvTitle = (TextView)view.findViewById(R.id.tv_tab);
            tvTitle.setText(tabTitlees[i]);
            ImageView imgTab = (ImageView) view.findViewById(R.id.img_tab);
            imgTab.setImageResource(tabImgs[i]);
            tabLayout.addTab(tab);

        }
    }
}
