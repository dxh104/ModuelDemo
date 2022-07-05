package com.dxh.modueldemo;

import android.app.Application;

import com.dxh.app_base.ActivityManner;
import com.dxh.app_main1.Main1Activity;
import com.dxh.app_main2.Main2Activity;

/**
 * Created by XHD on 2022/07/05
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActivityManner.put("MainActivity", MainActivity.class);
        ActivityManner.put("Main1Activity", Main1Activity.class);
        ActivityManner.put("Main2Activity", Main2Activity.class);
    }
}
