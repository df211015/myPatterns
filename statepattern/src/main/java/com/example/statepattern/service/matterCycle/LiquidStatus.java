package com.example.statepattern.service.matterCycle;

public class LiquidStatus extends MatterStatus {
    @Override
    public Boolean checkNext() {
        return Boolean.FALSE;
    }

    @Override
    public void statusProcess() {
        System.out.println("change to liquidStatus");
        if (this.checkNext()) {
            super.getContext().setCurrentStatus(Context.gasStatus);
        }
    }
}
