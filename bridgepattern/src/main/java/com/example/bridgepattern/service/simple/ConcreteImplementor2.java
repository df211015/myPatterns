package com.example.bridgepattern.service.simple;

public class ConcreteImplementor2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor2 -> doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor2 -> doAnything");
    }
}
