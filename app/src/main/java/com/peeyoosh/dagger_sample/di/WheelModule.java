package com.peeyoosh.dagger_sample.di;

import com.peeyoosh.dagger_sample.classes.Rim;
import com.peeyoosh.dagger_sample.classes.Tires;
import com.peeyoosh.dagger_sample.classes.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * classes that we don't own (created in third party libraries) we can't use inject annotation
 *
 */
@Module
public abstract class WheelModule {

    @Provides
    Rim provideRim() {
        return new Rim();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rim rim, Tires tires) {
        return new Wheels(rim, tires);
    }
}
