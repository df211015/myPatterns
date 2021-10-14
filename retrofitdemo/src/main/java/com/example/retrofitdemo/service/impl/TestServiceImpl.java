package com.example.retrofitdemo.service.impl;

import com.example.retrofitdemo.domain.Result;
import com.example.retrofitdemo.domain.VehicleInfo;
import com.example.retrofitdemo.service.ITestService;
import com.example.retrofitdemo.utils.HttpApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements ITestService {
    @Autowired
    private HttpApi httpApi;

    @Override
    public VehicleInfo getVehicleInfo(String unId) {
        Result<VehicleInfo> vehicleInfo = this.httpApi.getVehicleInfo(unId);
        return vehicleInfo.getData();
    }
}
