package com.example.flyweightpattern.service.simple;

public class ConcreteFlyweight1 extends Flyweight {
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //实现业务逻辑实现
        System.out.println("ConcreteFlyweight1 -> operate");
    }
}
