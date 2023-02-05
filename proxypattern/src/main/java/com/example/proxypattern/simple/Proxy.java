package com.example.proxypattern.simple;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        System.out.println("Proxy -> before");
    }

    private void after() {
        System.out.println("Proxy -> after");
    }
}
