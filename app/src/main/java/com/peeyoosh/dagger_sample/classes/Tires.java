package com.peeyoosh.dagger_sample.classes;

import android.util.Log;

import javax.inject.Inject;

public class Tires {
    private static final String TAG = "Tires";

    // Suppose we don't own this class and it is existing in third party library, hence we can't use
    // @Inject annotation here.
    public Tires(){

    }

    public void inflate(){
        Log.d(TAG, "======= inflate: Tires");
    }
}
