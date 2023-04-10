package com.example.chainpattern.service.customize;

public class HandlerOfThree extends Handler {
    @Override
    public Boolean checkFlag() {
        return Boolean.FALSE;
    }

    @Override
    public void doSomething() {
        System.out.println("HandlerOfThree --> doSomething");
    }
}
