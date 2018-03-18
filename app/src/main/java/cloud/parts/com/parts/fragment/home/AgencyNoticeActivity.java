package cloud.parts.com.parts.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.List;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.activity.BaseActivity;
import cloud.parts.com.parts.fragment.home.adapter.AgencyNoticeAdapter;
import cloud.parts.com.parts.fragment.home.bean.AgencyNoticeBean;
import cloud.parts.com.parts.login.user_centre.UserCentre;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.web.WebViewShow;

/**
 * describe:机构通告
 * date:2017/12/22
 * author:zhuang
 */
public class AgencyNoticeActivity extends BaseActivity {

    private ImageView include_banck;
    private TextView include_titles;
    private RecyclerView rl_agencynotice_list;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_agencynotice);
        include_banck = (ImageView) findViewById(R.id.include_banck);
        include_banck.setVisibility(View.VISIBLE);
        include_titles = (TextView) findViewById(R.id.include_titles);
        include_titles.setVisibility(View.VISIBLE);
        include_titles.setOnClickListener(this);
        rl_agencynotice_list = (RecyclerView) findViewById(R.id.rl_agencynotice_list);
        rl_agencynotice_list.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected void initData() {
        String title = getIntent().getStringExtra("title");
        String action = getIntent().getStringExtra("action");
        Log.e("---------------",action);

        include_titles.setText(title);
        httpData(action);
    }

    private void httpData(final String action) {
        //todo  获取token
        String token = UserCentre.getInstance().getToken();
        UrlBean urlBean = new UrlBean();
        urlBean.setAction(action);
        final Gson gson = new Gson();
        final String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.QUERYNEWS_URL)
                .tag(this)
                .upJson(s)
                .headers("authtoken", token)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        AgencyNoticeBean agencyNoticeBean = gson.fromJson(response.body()
                                .toString(), AgencyNoticeBean
                                .class);
                        String errorcode = agencyNoticeBean.getStatus();
                        if (errorcode.equals("0")) {
                            final List<AgencyNoticeBean.DataDicBean.ListBean> listBeans =
                                    agencyNoticeBean
                                            .getDataDic().getList();
                            AgencyNoticeAdapter mAdapter = new AgencyNoticeAdapter(R.layout
                                    .group_by_query_adapter,
                                    listBeans);
                            rl_agencynotice_list.setAdapter(mAdapter);
                            mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener
                                    () {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int
                                        position) {
                                    if (action.equals("0")) {
                                        String s = new String(Base64.decode(listBeans.get(position)
                                                .getNewscontent().getBytes(), Base64.DEFAULT));
                                        Intent intent = new Intent(AgencyNoticeActivity.this,
                                                WebViewShow.class);
                                        intent.putExtra("url", s);
                                        intent.putExtra("type", "0");
                                        startActivity(intent);
                                    } else {
                                        Intent intents = new Intent(AgencyNoticeActivity.this,
                                                ContentDisplayActivity.class);
                                        intents.putExtra("content", listBeans.get(position)
                                                .getNewscontent());
                                        startActivity(intents);
                                    }
                                }
                            });
                        } else {
                            Toast.makeText(AgencyNoticeActivity.this, agencyNoticeBean.getErrmsg
                                    (), Toast
                                    .LENGTH_LONG).show();
                        }
                    }
                });

    }

    protected void initListener() {
        include_banck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
