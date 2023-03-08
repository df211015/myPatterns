package com.example.observepattern.service.customize;

import java.util.Observable;

public class MySubject extends Observable {
    /**
     * 通知所有观察者
     *
     * @param param
     */
    public void notifyObservers(String param) {
        super.setChanged();
        super.notifyObservers(param);
    }
}
