package cloud.parts.com.parts.activity;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;


import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.ChartFragment;
import cloud.parts.com.parts.fragment.HomeFragment;
import cloud.parts.com.parts.fragment.ProjectFragment;
import cloud.parts.com.parts.fragment.UserFragment;

public class MainActivity extends BaseActivity{
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    TabLayout mTabLayout;
    private FragmentTabHost tab_host;
    private Class fragments[] = {HomeFragment.class, ProjectFragment.class,
            ChartFragment.class,UserFragment.class};
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
}
