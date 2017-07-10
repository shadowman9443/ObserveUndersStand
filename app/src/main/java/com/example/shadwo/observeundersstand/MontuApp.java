package com.example.shadwo.observeundersstand;

import android.app.Application;

/**
 * Created by shadwo on 7/11/2017.
 */

public class MontuApp extends Application {
    public CommonObserver mTest;
    private static MontuApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mTest = new CommonObserver();

    }
    public static synchronized MontuApp getInstance() {
        return mInstance;
    }
    public CommonObserver getObserver() {
        return mTest;
    }

}
