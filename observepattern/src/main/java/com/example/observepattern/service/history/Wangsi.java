package com.example.observepattern.service.history;

import java.util.Observable;
import java.util.Observer;

public class Wangsi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯报告:" + arg.toString());
    }
}
