package com.nativemodules;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import android.net.TrafficStats;

public class InternetConsumptionModule extends ReactContextBaseJavaModule {

    InternetConsumptionModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "InternetConsumption";
    }

    @ReactMethod
    public void getDataUsage(Promise promise) {
        try {
            long dataReceived = TrafficStats.getTotalRxBytes();
            long dataSent = TrafficStats.getTotalTxBytes();
             promise.resolve(Long.toString(dataSent + dataReceived));
        } catch (Exception e) {
            promise.reject("ERROR_GETTING_DATA_SENT", e);
        }
    }
}
