package cloud.parts.com.parts.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.FourSQueryAdapter;
import cloud.parts.com.parts.fragment.home.bean.FourSQueryBean;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;

/**
 * describe:4S店查询
 * date:2017/12/22
 * author:zhuang
 */

public class FourSQueryActivity extends BaseActivity implements View.OnClickListener {

    private ImageView include_banck;
    private TextView include_titles;
    private ImageView include_seek;
    private RecyclerView rl_cityfour_list;
    private ArrayList<FourSQueryBean.DataDicBean.ListBean> mListBeans;
    private Button bt_fours_shaixuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

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
        bt_fours_shaixuan = (Button) findViewById(R.id.bt_fours_shaixuan);
        bt_fours_shaixuan.setOnClickListener(this);
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
            case R.id.bt_fours_shaixuan:
                httpData("北京", "西城", "", "奥迪");
                break;
        }
    }

    private void httpData(String peovince, String city, String district, String keywds) {
        //todo  获取token
        String token = UserCentre.getInstance().getToken();
        UrlBean urlBean = new UrlBean();
        urlBean.setProvince(peovince);
        urlBean.setCity(city);
        urlBean.setDistrict(district);
        urlBean.setKeywds(keywds);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.QUERY4S_URL)
                .tag(this)
                .upJson(s)
                .headers("authtoken", token)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        FourSQueryBean fourSQueryBean = gson.fromJson(response.body()
                                .toString(), FourSQueryBean
                                .class);
                        String errorcode = fourSQueryBean.getStatus();
                        if (errorcode.equals("0")) {
                            mListBeans = fourSQueryBean
                                    .getDataDic().getList();
                            FourSQueryAdapter mAdapter = new FourSQueryAdapter(R.layout
                                    .foursquery_adapter,
                                    mListBeans);
                            rl_cityfour_list.setAdapter(mAdapter);
                            mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
                                    () {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int
                                        position) {
                                    Intent intent = new Intent(FourSQueryActivity.this,
                                            ModifyThePriceFourS.class);
                                    intent.putParcelableArrayListExtra("city", mListBeans);
                                    startActivity(intent);
                                }
                            });
                        } else {
                            Toast.makeText(FourSQueryActivity.this, fourSQueryBean.getErrmsg(),
                                    Toast
                                            .LENGTH_LONG).show();
                        }
                    }
                });

    }


}
