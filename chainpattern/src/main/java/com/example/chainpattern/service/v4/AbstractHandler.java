package com.example.chainpattern.service.v4;

public abstract class AbstractHandler {
    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private AbstractHandler nextHandler;

    /**
     * @param request
     */
    public final void handleRequest(AbstractRequest request) {
        Integer handleLevel = this.getHandleLevel();
        if (handleLevel.equals(request.getRequestLevel())) {
            this.handle(request);
        } else {
            if (null != this.nextHandler) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("没有相应的处理类");
            }
        }
    }

    protected abstract Integer getHandleLevel();

    protected abstract void handle(AbstractRequest<Integer, Integer> request);
}
