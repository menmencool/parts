package cloud.parts.com.parts.fragment.home;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.youth.banner.Banner;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import cloud.parts.com.parts.R;
import cloud.parts.com.parts.fragment.home.bean.HomeBean;
import cloud.parts.com.parts.url.CarUrl;
import cloud.parts.com.parts.url.urlbean.UrlBean;
import cloud.parts.com.parts.utils.GlideImageLoader;

public class HomeFragment extends Fragment {

    private Banner banner;
   private  ArrayList<String> imageViews = new ArrayList<>();
    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container,
                false);
        initView(rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
            initData();

    }

    private void initView(View rootView) {
        banner = (Banner) rootView.findViewById(R.id.banner);
    }

    private void initData() {

        UrlBean urlBean = new UrlBean();
        urlBean.setToken("1234567");
        final Gson gson = new Gson();
        String s = gson.toJson(urlBean);
        OkGo.<String>post(CarUrl.Home_URL)
                .tag(this)
                .upJson(s)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        HomeBean homeBean = gson.fromJson(response.body().toString(), HomeBean
                                .class);
                        List<HomeBean.DataDicBean.BannerBean> banners = homeBean.getDataDic()
                                .getBanner();
                        Log.e("-------------",banners.size()+"");
                        for (int i = 0; i <banners.size() ; i++) {
                            imageViews.add(banners.get(i).getImgurl());
                        }
                       banner.setImages(imageViews).setImageLoader(new GlideImageLoader()).start();
                    }
                });

    }

}
