package com.example.chainpattern.service.simple;

public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.third;
    }
}
