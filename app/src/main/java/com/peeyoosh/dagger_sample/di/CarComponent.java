package com.peeyoosh.dagger_sample.di;

import com.peeyoosh.dagger_sample.MainActivity;

import dagger.Component;


@Component(modules = WheelModule.class)
public interface CarComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);
}
