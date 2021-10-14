package com.example.observepattern.service.ring;

import java.util.Observable;
import java.util.Observer;

/**
 *
 */
public class StudentB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s,studentB收到", arg.toString()));
    }
}
