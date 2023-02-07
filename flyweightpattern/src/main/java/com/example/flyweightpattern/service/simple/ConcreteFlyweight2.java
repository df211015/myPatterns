package com.example.flyweightpattern.service.simple;

public class ConcreteFlyweight2 extends Flyweight {
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //实现业务逻辑
        System.out.println("ConcreteFlyweight2 -> operate");
    }
}
