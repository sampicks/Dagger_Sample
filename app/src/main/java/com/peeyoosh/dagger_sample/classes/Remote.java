package com.peeyoosh.dagger_sample.classes;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote(){}

    public void setListener(Car car){
        Log.d(TAG, "======== setListener: remoted connected");
    }
}
