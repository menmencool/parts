package cloud.parts.com.parts.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 格式化时间
 */
public class DateUtils {


    private static SimpleDateFormat sf = null;

    /*时间戳转换成字符窜*/
    public static String getDateToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sf.format(d);
    }


    /*将字符串转为时间戳*/
    public static long getStringToDate(String time) {
        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = sf.parse(time);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date.getTime();
    }


}