package com.example.statepattern.service.matterCycle;

public class GasStatus extends MatterStatus {
    @Override
    public Boolean checkNext() {
        return null;
    }

    @Override
    public void statusProcess() {
        System.out.println("change to gas");
    }
}
