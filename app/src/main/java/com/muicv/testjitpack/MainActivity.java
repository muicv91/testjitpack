package com.muicv.testjitpack;


import android.os.Bundle;
import android.widget.Button;

import com.muicv.mutils.ClientConfig;
import com.muicv.mutils.MainLoadingActivity;

public class MainActivity extends MainLoadingActivity {

    @Override
    protected void onNewNotices() {

    }

    @Override
    protected void onHasAds() {

    }

    @Override
    protected void onClientConfigLoaded() {

    }

    @Override
    protected void onUpdateAlert(boolean force) {

    }

    @Override
    protected void onFakeClientConfig(ClientConfig clientConfig) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1= findViewById(R.id.btn_1);
        btn1.setOnClickListener(view -> downloadYoutube("https://www.youtube.com/watch?v=BdPk9ipvczM"));

        initConfigApp();
    }




}