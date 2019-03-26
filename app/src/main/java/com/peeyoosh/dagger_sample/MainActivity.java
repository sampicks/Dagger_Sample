package com.peeyoosh.dagger_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.peeyoosh.dagger_sample.classes.Car;
import com.peeyoosh.dagger_sample.di.CarComponent;
import com.peeyoosh.dagger_sample.di.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();

        car = carComponent.getCar();

        car.drive();
    }
}
