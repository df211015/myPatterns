package com.example.retrofitdemo.service;

import com.example.retrofitdemo.domain.VehicleInfo;

public interface ITestService {
    VehicleInfo getVehicleInfo(String unifiedNumber);
}
