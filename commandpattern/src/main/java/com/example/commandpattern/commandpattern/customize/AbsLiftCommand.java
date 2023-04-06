package com.example.commandpattern.commandpattern.customize;

public abstract class AbsLiftCommand {
    public AbsLiftReceiver getLiftReceiver() {
        return liftReceiver;
    }

    private AbsLiftReceiver liftReceiver;

    public AbsLiftCommand(AbsLiftReceiver liftReceiver) {
        this.liftReceiver = liftReceiver;
    }

    public abstract void selectLift();
}
