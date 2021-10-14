package com.example.service.virtual;

import com.example.dto.VehicleInfo;

public abstract class VirtualVehicle {

    /**
     * @param unifiedNumber
     * @return
     */
    public abstract VehicleInfo generateVehicle(String unifiedNumber);
}
