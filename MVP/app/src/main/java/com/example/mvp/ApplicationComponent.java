package com.example.mvp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    //Daggeer 2 will use this to know where to inject the dependencies

    //Activities, services or fragments should be declared here
    void inject (MainActivity target);
}
