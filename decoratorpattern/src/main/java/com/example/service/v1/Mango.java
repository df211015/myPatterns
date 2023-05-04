package com.example.service.v1;

public class Mango extends Condiment {
    public Mango(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return String.format("%s(加芒果)", super.getDescription());
    }

    @Override
    public Double cost() {
        return super.cost() + 3d;
    }
}
