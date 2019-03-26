package com.peeyoosh.dagger_sample.classes;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // Car object can't be provided until we create an inject constructor or provides-method
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    
    public void drive(){
        Log.d(TAG, "======== drive: ");
    }
}
