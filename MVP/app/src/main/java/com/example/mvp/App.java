package com.example.mvp;

import android.app.Application;

public class App extends Application {
    //Class where dagger will live throughout the entire life of the application

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //Define every module we have in our app
        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
