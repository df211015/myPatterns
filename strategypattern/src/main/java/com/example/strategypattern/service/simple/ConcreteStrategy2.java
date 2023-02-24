package com.example.strategypattern.service.simple;

public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategy2 --> doSomething");
    }
}
