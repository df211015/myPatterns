package com.example.permissiondata.service;

/**
 *
 */
public abstract class MyCommandExt {
    /**
     * 定义命令接受者
     */
    private MyReceiverExt myReceiver;

    public MyReceiverExt getMyReceiver() {
        return myReceiver;
    }

    public void setMyReceiver(MyReceiverExt myReceiver) {
        this.myReceiver = myReceiver;
    }

    /**
     * 命令发起
     */
    public abstract void excute(String fileName,String fileName1);
}
