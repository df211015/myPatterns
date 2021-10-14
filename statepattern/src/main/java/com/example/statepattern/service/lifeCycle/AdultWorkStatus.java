package com.example.statepattern.service.lifeCycle;

public class AdultWorkStatus extends WorkStatus {
    @Override
    public void work() {
        System.out.println("成年人的工作状态");
        super.getContext().setCurrentWorkStatus(Context.oldWorkStatus);
    }
}