package com.peeyoosh.dagger_sample.di;

import android.content.Context;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;

    public AppModule(Context application) {
        context = application;
    }

    @Provides
    public Context getContext() {
        return context;
    }

    @Provides
    public Resources getResources() {
        return context.getResources();
    }
}
