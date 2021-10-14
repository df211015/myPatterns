package com.example.permissiondata.service;

/**
 *
 */
public abstract class MyCommand {
    /**
     * 定义命令接受者
     */
    private MyReceiver myReceiver;

    public MyReceiver getMyReceiver() {
        return myReceiver;
    }

    public void setMyReceiver(MyReceiver myReceiver) {
        this.myReceiver = myReceiver;
    }

    /**
     * 命令发起
     */
    public abstract void excute(String fileName);
}
