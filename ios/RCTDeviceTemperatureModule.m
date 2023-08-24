//
//  RCTDeviceTemperatureModule.m
//  nativeModules
//
//  Created by Mikita Shamkuts on 23/08/2023.
//

#import <Foundation/Foundation.h>
// RCTDeviceTemperatureModule.m
#import "RCTDeviceTemperatureModule.h"

@implementation RCTDeviceTemperatureModule

RCT_EXPORT_MODULE(DeviceTemperature);

// A mock method that simulates retrieving the device temperature
RCT_EXPORT_METHOD(getDeviceTemperature:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
  // Mock temperature value
  NSNumber *temperature = @(25.6); // in Celsius
  
  resolve(temperature);
}

@end

