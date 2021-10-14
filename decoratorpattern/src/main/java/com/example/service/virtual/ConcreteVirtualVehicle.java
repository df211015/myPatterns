package com.example.service.virtual;

import com.alibaba.fastjson.JSON;
import com.example.dto.VehicleInfo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteVirtualVehicle extends VirtualVehicle {
    @Override
    public VehicleInfo generateVehicle(String unifiedNumber) {
        log.info("ConcreteVirtualVehicle,start...");
        VehicleInfo vehicleInfo = this.buildVehicleInfo(unifiedNumber);
        log.info(String.format("ConcreteVirtualVehicle,end,vehicleInfo:%s", JSON.toJSONString(vehicleInfo)));
        return vehicleInfo;
    }

    /**
     *
     * @param unifiedNumber
     * @return
     */
    private VehicleInfo buildVehicleInfo(String unifiedNumber) {
        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setUnifiedNumber(unifiedNumber);
        return vehicleInfo;
    }
}
