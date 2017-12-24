package cloud.parts.com.parts.fragment.queryprice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.QueryPriceAdapter;
import cloud.parts.com.parts.fragment.queryprice.fragment.HQTPFragment;
import cloud.parts.com.parts.fragment.queryprice.fragment.NoQuotationFragment;
import cloud.parts.com.parts.fragment.queryprice.fragment.TSFragment;


public class QueryFormFragment extends Fragment implements OnClickListener {
    private TextView include_title;
    private ImageView include_seek;
    private TextView include_new;
    private String[] mStrings = new String[]{"暂存", "未报价", "已报价"};
    private TabLayout tabs;
    private ViewPager vp_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.queryform_chart, container, false);
        initView(rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void initView(View rootView) {
        include_title = (TextView) rootView.findViewById(R.id.include_title);
        include_title.setVisibility(View.VISIBLE);
        include_title.setText("我的询价单");
        include_seek = (ImageView) rootView.findViewById(R.id.include_seek);
        include_new = (TextView) rootView.findViewById(R.id.include_new);
        include_new.setVisibility(View.VISIBLE);
        include_new.setText("新建");
        include_seek.setVisibility(View.VISIBLE);
        include_seek.setImageResource(R.drawable.newpricelist3x);
        tabs = (TabLayout) rootView.findViewById(R.id.tabs);
        vp_view = (ViewPager) rootView.findViewById(R.id.vp_view);



        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new TSFragment());
        fragments.add(new NoQuotationFragment());
        fragments.add(new HQTPFragment());

        tabs.setTabMode(TabLayout.MODE_FIXED);

        QueryPriceAdapter adapter = new QueryPriceAdapter(getActivity().getSupportFragmentManager(),fragments, mStrings);
        vp_view.setAdapter(adapter);//给ViewPager设置适配器
        tabs.setupWithViewPager(vp_view);//将TabLayout和ViewPager关联起来。
        tabs.setTabsFromPagerAdapter(adapter);//给Tabs设置适配器
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            default:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}