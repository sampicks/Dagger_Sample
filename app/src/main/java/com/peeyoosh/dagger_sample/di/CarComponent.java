package com.peeyoosh.dagger_sample.di;

import com.peeyoosh.dagger_sample.MainActivity;
import com.peeyoosh.dagger_sample.classes.Car;

import dagger.Component;

@Component
public interface CarComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);
}
