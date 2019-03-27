package com.peeyoosh.dagger_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.peeyoosh.dagger_sample.classes.Car;
import com.peeyoosh.dagger_sample.di.CarComponent;
import com.peeyoosh.dagger_sample.di.DaggerCarComponent;
import com.peeyoosh.dagger_sample.di.DieselEngineModule;
import com.peeyoosh.dagger_sample.di.PassengerModule;
import com.peeyoosh.dagger_sample.di.WheelModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    // dagger doesn't support inject into private field
    // field injection is meant for framework type that android system instantiate i.e. activity or fragment
    // we can't do constructor injection inside our mainActivity
    @Inject
    Car car;
    @Inject
    String passenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                //since DieselEngineModule depends upon user input, we have to provide dependency like this way
                .dieselEngineModule(new DieselEngineModule(100))
                .passengerModule(new PassengerModule())
//                .wheelModule(new WheelModule())
                .build();

        carComponent.inject(this);

        car.drive();
        Log.d(TAG, "====== " + passenger);
    }
}
