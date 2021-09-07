package com.muicv.testjitpack;

import android.app.Application;

import com.muicv.mutils.AdsManager;
import com.muicv.mutils.Constants;

public class MyApp extends Application {

    private static AdsManager adsManager;

    @Override
    public void onCreate() {
        super.onCreate();

        //Config Constant khong bat buoc
//        Constants.DELAY_OPEN_ADS = 1000;
//        Constants.DELAY_FULL_ADS = 1200;
//        Constants.tag_data = "clientConfig";
//        Constants.VIDEO_AUDIO_PATH = "YOUTUBE";
//        Constants.log_tag = "adsdk";

        //Bat buoc
        AdsManager.DEBUG  = BuildConfig.DEBUG;
        AdsManager.PREFERENCE_NAME  = "muicv";
        AdsManager.APPLICATION_ID  = getPackageName();
        adsManager = new AdsManager(this);

    }
}
