package com.example.chainpattern.service.v3;

public abstract class Processor {
    protected Processor successor;

    public abstract Integer process(Integer input);

    public void setSuccessor(Processor successor) {
        this.successor = successor;
    }
}