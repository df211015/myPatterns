package com.example.observepattern.service.ring;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class StudentA extends Observable implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s,studentA收到", arg.toString()));
    }

    public void doSomething(){
        super.setChanged();
        super.notifyObservers("临时有事,不能参与活动");
    }
}
