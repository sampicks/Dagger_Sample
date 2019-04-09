package com.peeyoosh.dagger_sample.di;

import com.peeyoosh.dagger_sample.MainActivity;

import dagger.Component;


@Component(modules = {WheelModule.class, DieselEngineModule.class, PassengerModule.class, AppModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
