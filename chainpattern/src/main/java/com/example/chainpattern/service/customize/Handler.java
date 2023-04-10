package com.example.chainpattern.service.customize;

public abstract class Handler {
    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private Handler nextHandler;

    public abstract Boolean checkFlag();

    public abstract void doSomething();

    public void process() {
        if (this.checkFlag()) {
            this.doSomething();
        } else {
            if (null != this.nextHandler) {
                this.nextHandler.process();
            } else {
                System.out.println("没有处理类进行处理了");
            }
        }
    }
}
