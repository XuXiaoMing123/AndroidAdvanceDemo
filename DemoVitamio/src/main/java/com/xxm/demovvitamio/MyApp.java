package com.xxm.demovvitamio;

import android.app.Application;

import io.vov.vitamio.Vitamio;

/**
 * Created by xxm on 2019/2/25 0025
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Vitamio.isInitialized(this);
    }
}
