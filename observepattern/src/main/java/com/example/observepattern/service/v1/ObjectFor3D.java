package com.example.observepattern.service.v1;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * 更新主题消息
     *
     * @param msg 消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        this.notifyObservers();
    }

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
//        int index = this.observers.indexOf(observer);
//        if (index >= 0) {
//            this.observers.remove(index);
//        }
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(msg);
        }
    }


}
