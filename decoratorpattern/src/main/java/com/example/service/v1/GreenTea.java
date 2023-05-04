package com.example.service.v1;

public class GreenTea extends Beverage{
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public Double cost() {
        return 20d;
    }
}
