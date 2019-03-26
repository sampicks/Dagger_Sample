package com.peeyoosh.dagger_sample.classes;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // Car object can't be provided until we create an inject constructor or provides-method
    @Inject
    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    /**
     * If we have constructor injection, field and method injection will be injected
     * automatically in this order. 1)constructor  2)field  3)method
     */
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.startEngine();
        Log.d(TAG, "======== drive: ");
    }
}
