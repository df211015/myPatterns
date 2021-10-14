package com.example.observepattern.service.ring;

import java.util.Observable;
import java.util.Observer;

public class StudentC implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s,studentC收到", arg.toString()));
    }
}
