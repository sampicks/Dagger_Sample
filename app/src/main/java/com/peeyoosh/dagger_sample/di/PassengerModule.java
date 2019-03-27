package com.peeyoosh.dagger_sample.di;

import dagger.Module;
import dagger.Provides;

@Module
public class PassengerModule {

    public PassengerModule(){}

    @Provides
    public String getPassengers(){
        return "Tom Cruise & Nicole are your passenger";
    }
}
