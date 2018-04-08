package cloud.parts.com.parts.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.ModifyThePriceFourSAdapter;
import cloud.parts.com.parts.fragment.home.bean.FourSQueryBean;

/**
 * 类用途：
 * 作者：Zhuang
 * 时间：2018/4/8 21:35
 */

public class ModifyThePriceFourS extends BaseActivity {


    private ImageView include_banck;
    private TextView include_title_zhong;
    private RecyclerView rl_modefythepricefours_list;

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_modifythepricefours);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setOnClickListener(this);
        include_banck.setVisibility(View.VISIBLE);
        include_title_zhong = (TextView) findViewById(R.id.include_title_zhong);
        include_title_zhong.setVisibility(View.VISIBLE);
        include_title_zhong.setText("修改4S店报价");
        rl_modefythepricefours_list = (RecyclerView) findViewById(R.id.rl_modefythepricefours_list);
        rl_modefythepricefours_list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        ArrayList<FourSQueryBean.DataDicBean.ListBean> city = getIntent()
                .getParcelableArrayListExtra("city");
        ModifyThePriceFourSAdapter mAdapter = new ModifyThePriceFourSAdapter(R.layout
                .foursquery_adapter,
                city);
        rl_modefythepricefours_list.setAdapter(mAdapter);
       /* mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
                () {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int
                    position) {
                Intent intent = new Intent(ModifyThePriceFourS.this,
                        ModifyThePriceFourS.class);
                intent.putParcelableArrayListExtra("city", mListBeans);
                startActivity(intent);
            }
        });*/

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
}
