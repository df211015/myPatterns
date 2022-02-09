package com.example.chainpattern.service.v2;

import com.example.chainpattern.domain.ApplyInfo;

/**
 * 请假申请处理
 */
public abstract class ApplyHandler {
    /**
     * 申请详情
     */
    private ApplyInfo applyInfo;

    public ApplyHandler(ApplyInfo applyInfo) {
        this.applyInfo = applyInfo;
    }

    /**
     * 下一步的处理类
     */
    private ApplyHandler nextHandler;

    protected ApplyInfo getApplyInfo() {
        return applyInfo;
    }

    public ApplyHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ApplyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler() {
        Boolean result = this.check();
        if (result) {
            this.audit();
        } else {
            if (null != this.nextHandler) {
                this.nextHandler.handler();
            } else {
                System.out.println("没有处理类!");
            }
        }
    }

    public abstract void audit();

    public abstract Boolean check();
}
