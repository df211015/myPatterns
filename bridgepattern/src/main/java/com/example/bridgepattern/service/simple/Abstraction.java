package com.example.bridgepattern.service.simple;

public abstract class Abstraction {
    private Implementor imp;

    public Implementor getImp() {
        return imp;
    }

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public void request(){
        this.imp.doSomething();
    }
}
