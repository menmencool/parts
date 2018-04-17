package duck.citychoose.utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ====================================================
 * 作    者：DUCK
 * 版    本：
 * 创建日期：2018/4/16 - 13:10
 * 描    述：
 * 修订历史：
 * ====================================================
 */

public final class CommonTools {

    private static CommonTools instance = null;

    private CommonTools(){}

    public static CommonTools getInstance(){
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    private static synchronized void createInstance () {
        if (instance == null) {
            instance = new CommonTools();
        }
    }

    /**
     * 获取assets资源文件下的 json文件
     *
     * @param context  context
     * @param fileName 文件名
     * @return 需要判空
     */
    public String getJson(Context context, String fileName) {

        final StringBuilder stringBuilder = new StringBuilder();

        try {
            final AssetManager assetManager = context.getAssets();
            final BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }

            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return stringBuilder.toString();
    }

}
