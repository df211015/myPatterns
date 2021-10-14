package com.example.service.virtual;

import com.example.dto.VehicleInfo;

public abstract class VirtualVehicleDecorator extends VirtualVehicle {

    private VirtualVehicle virtualVehicle;

    public VirtualVehicleDecorator(VirtualVehicle virtualVehicle) {
        this.virtualVehicle = virtualVehicle;
    }

    @Override
    public VehicleInfo generateVehicle(String unifiedNumber) {
        return this.virtualVehicle.generateVehicle(unifiedNumber);
    }
}
