package com.example.bridgepattern.service.v1;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
