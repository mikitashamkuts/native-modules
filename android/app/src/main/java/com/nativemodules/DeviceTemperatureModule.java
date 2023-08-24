package com.nativemodules;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class DeviceTemperatureModule extends ReactContextBaseJavaModule {

    DeviceTemperatureModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "DeviceTemperature";
    }

   
    @ReactMethod
    public void getDeviceTemperature(Promise promise) {
        try {
            // Mock temperature value
            double temperature = 30.0;  // in Celsius

            promise.resolve(temperature);
        } catch (Exception e) {
            promise.reject("ERROR_GETTING_TEMPERATURE", e);
        }
    }
}

