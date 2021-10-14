package com.example.observepattern.service.ring;

import java.util.Observable;

/**
 * 被观察者
 */
public class MyRing extends Observable {

    public void playRing(){
        System.out.println("铃声响起....");
        super.setChanged();
        super.notifyObservers("上课铃声响起");
    }
}
