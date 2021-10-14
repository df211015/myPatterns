package com.example.statepattern.service.lifeCycle;

public class OldWorkStatus extends WorkStatus {
    @Override
    public void work() {
        System.out.println("老年人的工作状态");
    }
}