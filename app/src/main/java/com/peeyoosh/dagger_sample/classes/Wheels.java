package com.peeyoosh.dagger_sample.classes;

import javax.inject.Inject;

public class Wheels {

    private Rim rim;
    private Tires tires;

    // Suppose we don't own this class and it is existing in third party library, hence we can't use
    // @Inject annotation here.
    public Wheels(Rim rim, Tires tires) {
        this.rim = rim;
        this.tires = tires;
    }
}
