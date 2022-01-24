package com.example.statepattern.service.normal;

import com.example.statepattern.domain.EMyStatus;

public class ConcreteMyStatus2 extends MyStatus{
    @Override
    public void operate() {
        System.out.println("ConcreteMyStatus2.operate");
        super.getMyContext().seteMyStatus(EMyStatus.STATUS_003);
    }
}
