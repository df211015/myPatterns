package com.example.service.v1;

public class RedTea extends Beverage {

    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public Double cost() {
        return 10d;
    }
}
