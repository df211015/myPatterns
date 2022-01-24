package com.example.statepattern.service.normal;

import com.example.statepattern.domain.EMyStatus;

import java.util.HashMap;
import java.util.Map;

public class MyContext {
    private Map<EMyStatus, MyStatus> statusMap = new HashMap<>();
    private MyStatus currentStatus;

    public MyContext() {
        this.initMap();
    }

    private void initMap() {
        this.statusMap.clear();
        this.statusMap.put(EMyStatus.STATUS_001, new ConcreteMyStatus1());
        this.statusMap.put(EMyStatus.STATUS_002, new ConcreteMyStatus2());
        this.statusMap.put(EMyStatus.STATUS_003, new ConcreteMyStatus3());
    }

    public void seteMyStatus(EMyStatus eMyStatus) {
        this.currentStatus = this.statusMap.get(eMyStatus);
        if (null != this.currentStatus) {
            this.currentStatus.setMyContext(this);
        }
    }

    public void operate() {
        if (null != this.currentStatus) {
            this.currentStatus.operate();
        } else {
            System.out.println("未找到相应的处理类!");
        }
    }
}