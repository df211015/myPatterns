package com.example.statepattern.service.matterCycle;

public class SolidStatus extends MatterStatus {
    @Override
    public Boolean checkNext() {
        return Boolean.FALSE;
    }

    @Override
    public void statusProcess() {
        System.out.println("change to solid.");
        if (this.checkNext()) {
            super.getContext().setCurrentStatus(Context.liquidStatus);
        }
    }
}
