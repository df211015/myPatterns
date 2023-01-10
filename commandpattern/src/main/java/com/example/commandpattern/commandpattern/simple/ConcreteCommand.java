package com.example.commandpattern.commandpattern.simple;

public class ConcreteCommand extends AbsCommand {
    public ConcreteCommand(AbsReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.execute();
    }
}
