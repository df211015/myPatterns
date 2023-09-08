package com.example.chainpattern.service.v5;

public abstract class AbstractHandler {
    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    private com.example.chainpattern.service.v5.AbstractHandler next;

    public abstract Integer play();

    public abstract Integer handler();
}
