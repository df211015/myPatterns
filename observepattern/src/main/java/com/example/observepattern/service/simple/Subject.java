package com.example.observepattern.service.simple;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> lstObs = new ArrayList<>();

    public void addObserver(Observer item) {
        this.lstObs.add(item);
    }

    public void delObserver(Observer item) {
        this.lstObs.remove(item);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObserver() {
        for (Observer item : this.lstObs) {
            item.updatete();
        }
    }
}
