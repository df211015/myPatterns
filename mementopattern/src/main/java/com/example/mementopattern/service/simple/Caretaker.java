package com.example.mementopattern.service.simple;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> lstMemento = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.lstMemento.add(memento);
    }

    public Memento getLastMemento() {
        return this.lstMemento.get(this.lstMemento.size() - 1);
    }
}
