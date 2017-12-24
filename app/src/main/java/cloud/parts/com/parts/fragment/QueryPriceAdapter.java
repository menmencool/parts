package cloud.parts.com.parts.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2017/12/24 15:47
 */

public class QueryPriceAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private String[] mStrings;

    public QueryPriceAdapter(FragmentManager fm, ArrayList<Fragment> fragments, String[] strings) {
        super(fm);
        this.fragments = fragments;
        mStrings = strings;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mStrings[position];//页卡标题
    }
}
