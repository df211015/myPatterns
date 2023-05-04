package com.example.service.v1;

/**
 * 装饰基类
 */
public abstract class Condiment extends Beverage {
    private Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public Double cost() {
        return this.beverage.cost();
    }
}
