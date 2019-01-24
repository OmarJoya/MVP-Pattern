package com.example.mvp.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    //Dagger 2 will use this class to track dependencies

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton //instance should be created only once
    public Context provideContext() {
        return application;
    }
}
