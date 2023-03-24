package com.example.mementopattern.service.simple;

public class Originator {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Memento createMemento() {
        return new Memento(this.data);
    }

    public void recover(Memento memento) {
        this.data = memento.getData();
    }
}
