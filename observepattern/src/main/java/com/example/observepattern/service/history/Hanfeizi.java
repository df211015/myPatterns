package com.example.observepattern.service.history;

import java.util.Observable;

public class Hanfeizi extends Observable {
    public void doSomething() {
        System.out.println("韩非子:我要吃饭了");
        super.setChanged();
        super.notifyObservers("韩非子开始吃饭");
    }
}
