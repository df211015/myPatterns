package com.example.visitorpattern.service.simple;

public abstract class Element {
    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);
}
