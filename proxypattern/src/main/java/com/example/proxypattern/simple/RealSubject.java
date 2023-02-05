package com.example.proxypattern.simple;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject -> request");
    }
}
