package com.peeyoosh.dagger_sample.di;

import com.peeyoosh.dagger_sample.classes.DieselEngine;
import com.peeyoosh.dagger_sample.classes.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public Engine getEngine() {
        return new DieselEngine(horsePower);
    }
}
