package com.example.chainpattern.service.customize;

public class HandlerOfTwo extends Handler {
    @Override
    public Boolean checkFlag() {
        return Boolean.TRUE;
    }

    @Override
    public void doSomething() {
        System.out.println("HandlerOfTwo --> doSomething");
    }
}
