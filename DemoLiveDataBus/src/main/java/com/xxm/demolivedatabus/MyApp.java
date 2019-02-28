package com.xxm.demolivedatabus;

import android.app.Application;

import com.xxm.toolbase.utils.Utils;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;

/**
 * Created by Administrator on 2019/2/26 0026
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        BGASwipeBackHelper.init(this,null);
    }
}
