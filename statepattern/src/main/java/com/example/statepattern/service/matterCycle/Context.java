package com.example.statepattern.service.matterCycle;

public class Context {
    protected final static MatterStatus gasStatus = new GasStatus();
    protected final static MatterStatus liquidStatus = new LiquidStatus();
    protected final static MatterStatus solidStatus = new SolidStatus();

    private MatterStatus currentStatus;

    public MatterStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(MatterStatus currentStatus) {
        this.currentStatus = currentStatus;
        this.currentStatus.setContext(this);
    }

    public void statusProcess() {
        this.currentStatus.statusProcess();
        if (!this.currentStatus.checkNext()) {
            System.out.println("不能下一步");
        }
    }
}
