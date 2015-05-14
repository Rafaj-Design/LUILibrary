package io.liveui.framework.luisample;

import android.app.Application;
import android.content.Context;

import io.liveui.framework.LUI;

/**
 * Created by Vojtìch on 14. 5. 2015.
 */
public class LUIApplication extends Application {

    private static LUIApplication sInstance;
    private LUI lui;

    @Override
    public void onCreate() {
        super.onCreate();

        LUIApplication.sInstance = this;

    }

    public static LUIApplication getInstance() {
        return sInstance;
    }

    public LUI getLUI(Context context) {
        if(lui == null) {
            lui = LUI.getInstance(context,
                    super.getResources());
        }
        return lui;
    }
}
