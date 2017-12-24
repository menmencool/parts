package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;

/**
 * describe:
 * date:2017/12/22
 * author:zhuang
 */

public class FourSQueryActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_titles;
    private ImageView include_seek;
    private RecyclerView rl_cityfour_list;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_foursquery);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_banck.setOnClickListener(this);
        include_titles = (TextView) findViewById(R.id.include_titles);
        include_titles.setVisibility(View.VISIBLE);
        include_titles.setText("4S店查询");
        include_titles.setOnClickListener(this);
        include_seek = (ImageView) findViewById(R.id.include_seek);
        include_seek.setVisibility(View.VISIBLE);
        include_seek.setOnClickListener(this);
        rl_cityfour_list = (RecyclerView) findViewById(R.id.rl_cityfour_list);
        rl_cityfour_list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
      /*  VINQueryAdapter adapter = new VINQueryAdapter(R.layout.foursquery_adapter, dataDicBeans);
        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        rl_home_carlist.setAdapter(adapter);
                        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                                String pkgId = result.get(position).getTestPkgId();
                                Intent intent = new Intent(context, PkgIdActivity.class);
                                intent.putExtra("id", pkgId);
                                context.startActivity(intent);
                            }
                        });*/
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
    }
}
