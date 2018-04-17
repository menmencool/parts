package duck.citychoose.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

import java.util.List;
import java.util.Map;


/**
 * ====================================================
 * 作    者：DUCK
 * 版    本：
 * 创建日期：2017/4/21 - 13:40
 * 描    述：json解析管理类(fastjson)
 * 修订历史：
 * ====================================================
 */
public final class JsonMananger {

    static {
        TypeUtils.compatibleWithJavaBean = true;
    }

    private static final String tag = JsonMananger.class.getSimpleName();

    //将json转换成对象
    public static <T> T jsonToBean(String json, Class<T> cls) throws Exception {
        T t = null;
        try {
            t = JSON.parseObject(json, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    //将json转换成list对象
    public static <T> List<T> jsonToList(String json, Class<T> cls) {
        List<T> listT = null;
        try {
            listT = JSON.parseArray(json, cls);
        } catch (JSONException exception) {

        }
        return listT;
    }

    //将对象转换成json
    public static String beanToJson(Object obj) {
        String result = JSON.toJSONString(obj);
        return result;
    }

    //将map转换成json
    public static String mapToJson(Map obj){
        String result = JSON.toJSONString(obj);
        return result;
    }

    public static <T> T getReponseResult(String resultStr, Class<T> cls) {
        T t = null;
        try {
            t = JsonMananger.jsonToBean(resultStr, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    //将json转化成map集合
    public static Map<String, Object> JsonStrToMap(String jsonStr) {
        Map<String, Object> map = JSON.parseObject(
                jsonStr, new TypeReference<Map<String, Object>>() {
                });

        return map;
    }

}
