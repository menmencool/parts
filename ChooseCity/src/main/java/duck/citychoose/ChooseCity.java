package duck.citychoose;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import duck.citychoose.bean.CBean;
import duck.citychoose.bean.CityBean;
import duck.citychoose.bean.MBean;
import duck.citychoose.picker_view.OptionsPickerView;
import duck.citychoose.port.CityCallBack;
import duck.citychoose.utils.CommonTools;
import duck.citychoose.utils.JsonMananger;

import static android.content.ContentValues.TAG;

/**
 * ====================================================
 * 作    者：DUCK
 * 版    本：
 * 创建日期：2018/4/16 - 16:03
 * 描    述：
 * 修订历史：
 * ====================================================
 */

public final class ChooseCity {

    private final int CANCEL_COLOR = Color.parseColor("#666666"); //取消文字的颜色
    private final int SUBMIT_COLOR = Color.parseColor("#B5A177"); //确定文字的颜色
    private final int TITLE_BG_COLOR = Color.parseColor("#F2F2F2"); //题头背景色
    private final int TEXT_COLOR_CENTER = Color.BLACK; //设置选中项文字颜色
    private final int CONTENT_TEXT_SIZE = 20; //文字大小
    private final String TITLE_TEXT; //中间提示文字的内容

    private boolean isCityReady;
    private Activity context;
    private CityCallBack callBack;

    private List<CityBean> options1Items = new ArrayList<>();
    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<>();

    public ChooseCity(Activity context, CityCallBack callBack) {
        this.context = context;
        this.callBack = callBack;
        this.TITLE_TEXT = context.getString(R.string.choose_city);

        /**
         * 初始化城市信息 信息量可能很大 子线程处理
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                initCity();
            }
        }).start();
    }

    /**
     * 不用时请释放资源
     */
    public void recycle() {
        context = null;
        callBack = null;

        if (options1Items != null) {
            options1Items.clear();
            options1Items = null;
        }
        if (options2Items != null) {
            options2Items.clear();
            options2Items = null;
        }
        if (options3Items != null) {
            options3Items.clear();
            options3Items = null;
        }
    }

    /**
     * 初始化城市信息
     */
    private void initCity() {

        /**
         * 注意：assets 目录下的Json文件仅供参考，实际使用可自行替换文件
         * 关键逻辑在于循环体
         */
        final String JsonData = CommonTools.getInstance().getJson(context, "city.json");//获取assets目录下的json文件数据

        if (TextUtils.isEmpty(JsonData)) {
            toast(R.string.get_city_failed);
            isCityReady = false;
            return;
        }

        Log.d(TAG, "json : " + JsonData);

        final List<CityBean> jsonBean = parseData(JsonData);//转成实体bean
        if (jsonBean.isEmpty()) {
            toast(R.string.get_city_failed);
            isCityReady = false;
            return;
        }

        /**
         * 添加省份数据
         *
         * 注意：如果是添加的JavaBean实体，则实体类需要实现 IPickerViewData 接口，
         * PickerView会通过getPickerViewText方法获取字符串显示出来。
         */
        options1Items = jsonBean;

        List<CBean> list; //市
        List<MBean> mList; // 区

        for (int i = 0; i < jsonBean.size(); i++) {
            //遍历省份
            ArrayList<String> CityList = new ArrayList<>();//该省的城市列表（第二级）
            ArrayList<ArrayList<String>> Province_AreaList = new ArrayList<>();//该省的所有地区列表（第三级）


            list = jsonBean.get(i).getC();

            //国外
            if (list == null) {
                ArrayList<String> City_AreaList = new ArrayList<>();//该城市的所有地区列表
                CityList.add("");//直接添加区名
                City_AreaList.add("");
                Province_AreaList.add(City_AreaList);//添加该省所有地区数据
            } else {
                for (int c = 0; c < list.size(); c++) {//遍历该省份的所有城市
                    String CityName = list.get(c).getN();
                    CityList.add(CityName);//添加城市
                    mList = list.get(c).getD();
                    ArrayList<String> City_AreaList = new ArrayList<>();//该城市的所有地区列表

                    //如果无地区数据，建议添加空字符串，防止数据为null 导致三个选项长度不匹配造成崩溃
                    if (mList == null || mList.isEmpty()) {
                        City_AreaList.add("");
                    } else {
                        String s;
                        for (MBean mBean : mList) {//该城市对应地区所有数据
                            s = mBean.getS();
                            City_AreaList.add(s);//添加该城市所有地区数据
                        }
                    }
                    Province_AreaList.add(City_AreaList);//添加该省所有地区数据
                }
            }

            options2Items.add(CityList); //添加城市数据
            options3Items.add(Province_AreaList); //添加地区数据

        }

        isCityReady = true;
    }

    /**
     * 将城市json转换成对应的数据
     *
     * @return
     */
    private List<CityBean> parseData(String result) {//Json 解析
        final List<CityBean> detail = JsonMananger.jsonToList(result, CityBean.class);
        return detail;
    }

    /**
     * 显示城市选择
     */
    public void showSelectCity() {
        if (!isCityReady) {
            toast(R.string.get_city_failed);
            return;
        }

        final OptionsPickerView pvOptions = new OptionsPickerView.Builder(context, new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int options2, int options3, View v) {
                //返回的分别是三个级别的选中位置
                if (callBack != null) {
                    final String var1 = options1Items.get(options1).getPickerViewText();
                    final String var2 = options2Items.get(options1).get(options2);
                    final String var3 = options3Items.get(options1).get(options2).get(options3);
                    callBack.back(var1, var2, var3);
                }
            }
        })
                .setCancelColor(CANCEL_COLOR)
                .setSubmitColor(SUBMIT_COLOR)
                .setTitleBgColor(TITLE_BG_COLOR)
                .setTitleText(TITLE_TEXT)
                .setTextColorCenter(TEXT_COLOR_CENTER)
                .setContentTextSize(CONTENT_TEXT_SIZE)
                .build();

        pvOptions.setPicker(options1Items, options2Items, options3Items); //三级选择器
        pvOptions.show();
    }

    /**
     * 快速吐丝
     *
     * @param message
     */
    private void toast(String message) {

        if (context == null) {
            return;
        }

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 快速吐丝
     *
     * @param resId
     */
    private void toast(int resId) {
        final String m = context.getString(R.string.get_city_failed);
        toast(m);
    }

}
