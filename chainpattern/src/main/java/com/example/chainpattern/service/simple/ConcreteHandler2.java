package com.example.chainpattern.service.simple;

public class ConcreteHandler2 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return Level.seconde;
    }
}
