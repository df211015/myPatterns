package com.example.observepattern.service.simple;

public class ConcreteSubject extends Subject {
    public void doSomething() {
        super.notifyObserver();
    }
}
