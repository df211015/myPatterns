package com.example.service.virtual;

import com.alibaba.fastjson.JSON;
import com.example.dto.VehicleInfo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VirtualVehiclePlusOfPrice extends VirtualVehicleDecorator {
    private Double quotePrice;
    private Double fullPrice;
    private String forUnid;

    public VirtualVehiclePlusOfPrice(VirtualVehicle virtualVehicle) {
        super(virtualVehicle);
    }

    public VirtualVehiclePlusOfPrice(VirtualVehicle virtualVehicle, Double quotePrice, Double fullPrice, String forUnid) {
        super(virtualVehicle);
        this.quotePrice = quotePrice;
        this.fullPrice = fullPrice;
        this.forUnid = forUnid;
    }

    @Override
    public VehicleInfo generateVehicle(String unifiedNumber) {
        log.info("VirtualVehiclePlusOfPrice,start...");
        VehicleInfo vehicleInfo = super.generateVehicle(unifiedNumber);
        this.rebuildVehicle(vehicleInfo);
        log.info(String.format("VirtualVehiclePlusOfPrice,end,vehicleInfo:%s", JSON.toJSONString(vehicleInfo)));
        return vehicleInfo;
    }

    /**
     * 完善车源信息
     *
     * @param vehicleInfo
     */
    private void rebuildVehicle(VehicleInfo vehicleInfo) {
        if (null != vehicleInfo) {
            vehicleInfo.setQuotePrice(this.quotePrice);
            vehicleInfo.setFullPrice(this.fullPrice);
            vehicleInfo.setForUnid(this.forUnid);
        }
    }
}
