package ua.com.meli5on.finalclock;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Andrew on 29.11.2017.
 */

public class App extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
