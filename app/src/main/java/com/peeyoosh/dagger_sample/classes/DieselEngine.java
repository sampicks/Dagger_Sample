package com.peeyoosh.dagger_sample.classes;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int horsePower;

    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }
    @Override
    public void startEngine() {
        Log.d(TAG, "======== startEngine: with Horsepower "+horsePower);
    }
}
