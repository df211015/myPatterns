package com.example.service.simple;

public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMehod1();
    }
}
