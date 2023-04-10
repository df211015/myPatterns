package com.example.chainpattern.service.customize;

public class HandlerOfOne extends Handler {
    @Override
    public Boolean checkFlag() {
        return Boolean.FALSE;
    }

    @Override
    public void doSomething() {
        System.out.println("HandlerOfOne --> doSomething");
    }
}
