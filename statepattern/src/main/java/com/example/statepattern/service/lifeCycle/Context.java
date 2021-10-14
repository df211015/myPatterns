package com.example.statepattern.service.lifeCycle;

/**
 *
 */
public class Context {
    protected final static WorkStatus childWorkStatus = new ChildWorkStatus();
    protected final static WorkStatus adultWorkStatus = new AdultWorkStatus();
    protected final static WorkStatus oldWorkStatus = new OldWorkStatus();
    //当前的工作状态
    private WorkStatus currentWorkStatus;

    public void setCurrentWorkStatus(WorkStatus currentWorkStatus) {
        this.currentWorkStatus = currentWorkStatus;
        this.currentWorkStatus.setContext(this);
    }

    public void work() {
        this.currentWorkStatus.work();
    }
}