package io.liveui.framework.luisample;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Vojtìch on 14. 5. 2015.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public Resources getResources() {
        return LUIApplication.getInstance().getLUI(this).getResources();
    }
}
