package com.example.commandpattern.commandpattern.simple;

public class ConcreteReceiver extends AbsReceiver {
    @Override
    public void execute() {
        System.out.println("ConcreteReceiver execute");
    }
}
