package cloud.parts.com.parts;

import android.app.Application;

/**
 * Created by admin on 2017/12/1.
 */

public class partsApp extends Application{
    private static final partsApp ourInstance = new partsApp();

    public static partsApp getInstance() {
        return ourInstance;
    }

    private partsApp() {
    }
}
