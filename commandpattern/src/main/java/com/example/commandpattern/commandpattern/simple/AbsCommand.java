package com.example.commandpattern.commandpattern.simple;

/**
 * 命令申请类
 */
public abstract class AbsCommand {
    protected final AbsReceiver receiver;

    public AbsCommand(AbsReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
