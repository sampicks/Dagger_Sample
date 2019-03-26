package com.peeyoosh.dagger_sample.classes;

import javax.inject.Inject;

public class Wheels {

    // Wheels object can't be provided until we create an inject constructor or provides-method
    @Inject
    public Wheels(){

    }
}
