//
//  RCTInternetConsumptionModule.m
//  nativeModules
//
//  Created by Mikita Shamkuts on 23/08/2023.
//

#import <Foundation/Foundation.h>
// RCTInternetConsumptionModule.m
#import "RCTInternetConsumptionModule.h"

@implementation RCTInternetConsumptionModule

RCT_EXPORT_MODULE(InternetConsumption);

// A mock method that simulates retrieving network consumption data
RCT_EXPORT_METHOD(getDataUsage:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
  // Mock data usage value
  NSNumber *dataUsage = @(76543211234567); // in bytes
  
  resolve(dataUsage);
}

@end
