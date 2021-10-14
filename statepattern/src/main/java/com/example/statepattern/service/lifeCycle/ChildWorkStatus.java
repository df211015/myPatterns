package com.example.statepattern.service.lifeCycle;

public class ChildWorkStatus extends WorkStatus {
    @Override
    public void work() {
        System.out.println("小孩的工作状态");
        super.getContext().setCurrentWorkStatus(Context.adultWorkStatus);
    }
}