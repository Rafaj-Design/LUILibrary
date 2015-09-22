package io.liveui.framework;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Vojtech on 14. 5. 2015.
 */
public class LUI {

    public static String apiKey;

    private static LUI sInstance;
    private Context mContext;
    private Resources mAndroidResources;
    private AssetManager mAssetManager;
    private DisplayMetrics mDisplayMetrics;
    private Configuration mConfiguration;

    private LUIResources mResources;

    protected LUI(Context context, Resources androidResources) {
        this.mContext = context;
        this.mAndroidResources = androidResources;
    }

    public static LUI getInstance(Context context, Resources androidResources) {
        if(sInstance == null) {
            sInstance = new LUI(context, androidResources);
        }
        return sInstance;
    }

    public Resources getResources() {
        if (mResources == null) {
            this.mAssetManager = mAndroidResources.getAssets();
            this.mDisplayMetrics = mAndroidResources.getDisplayMetrics();
            this.mConfiguration = mAndroidResources.getConfiguration();
            mResources = new LUIResources(mAssetManager, mDisplayMetrics, mConfiguration);
        }
        return mResources;
    }
}
