package com.example.statepattern.service.normal;

import com.example.statepattern.domain.EMyStatus;

public class ConcreteMyStatus1 extends MyStatus {
    @Override
    public void operate() {
        System.out.println("ConcreteMyStatus1.operate");
        super.getMyContext().seteMyStatus(EMyStatus.STATUS_002);
    }
}