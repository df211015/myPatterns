package com.example.mementopattern.service.simple;

public class Memento {
    private String data;

    public Memento(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }
}
