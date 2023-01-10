package com.example.chainpattern.service.simple;

public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return Level.first;
    }
}
