package com.example.observepattern.service.history;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯报告:" + arg.toString());
    }
}
