package com.example.commandpattern.commandpattern.customize;

public class ConcreteLiftCommand extends AbsLiftCommand {

    public ConcreteLiftCommand(AbsLiftReceiver liftReceiver) {
        super(liftReceiver);
    }

    @Override
    public void selectLift() {
        System.out.println("请选择上下楼的操作");
        AbsLiftReceiver liftReceiver = super.getLiftReceiver();
        if (null != liftReceiver) {
            liftReceiver.selectLift();
        }
    }
}
