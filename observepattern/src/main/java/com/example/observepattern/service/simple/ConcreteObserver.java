package com.example.observepattern.service.simple;

public class ConcreteObserver implements Observer {
    @Override
    public void updatete() {
        System.out.println("ConcreteObserver -> update");
    }
}
