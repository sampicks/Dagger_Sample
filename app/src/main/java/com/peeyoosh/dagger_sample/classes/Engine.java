package com.peeyoosh.dagger_sample.classes;

import javax.inject.Inject;

public class Engine {

    // Engine object can't be provided until we create an inject constructor or provides-method
    @Inject
    public Engine(){

    }
}
