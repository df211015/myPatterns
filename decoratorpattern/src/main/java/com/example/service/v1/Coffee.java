package com.example.service.v1;

public class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public Double cost() {
        return 30d;
    }
}
