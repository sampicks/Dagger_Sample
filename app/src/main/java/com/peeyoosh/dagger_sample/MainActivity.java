package com.peeyoosh.dagger_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.peeyoosh.dagger_sample.classes.Car;
import com.peeyoosh.dagger_sample.di.CarComponent;
import com.peeyoosh.dagger_sample.di.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // dagger doesn't support inject into private field
    // field injection is meant for framework type that android system instantiate i.e. activity or fragment
    // we can't do constructor injection inside our mainActivity
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
//      car = carComponent.getCar();
        carComponent.inject(this);

        car.drive();
    }
}
