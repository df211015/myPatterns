package com.example.retrofitdemo.controller;

import com.example.retrofitdemo.domain.VehicleInfo;
import com.example.retrofitdemo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private ITestService iTestService;

    @GetMapping("/getcar")
    public VehicleInfo getVehicleInfo(String unid){
        VehicleInfo obj = this.iTestService.getVehicleInfo(unid);

        return obj;
    }
}
