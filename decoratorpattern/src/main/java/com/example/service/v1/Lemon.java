package com.example.service.v1;

public class Lemon extends Condiment {
    public Lemon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return String.format("%s(加柠檬)", super.getDescription());
    }

    @Override
    public Double cost() {
        return super.cost() + 2d;
    }
}
