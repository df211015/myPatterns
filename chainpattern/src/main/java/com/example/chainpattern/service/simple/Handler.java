package com.example.chainpattern.service.simple;

public abstract class Handler {
    private Handler nextHandler;

    public final Response handlerMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (null != this.nextHandler) {
                response = this.nextHandler.handlerMessage(request);
            } else {
                System.out.println("没有适当的处理者,业务自行处理");
            }
        }
        return response;
    }

    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理级别,子类实现该方法
    protected abstract Level getHandlerLevel();

    private Response echo(Request request) {
        Level requestLevel = request.getRequestLevel();
        Response res = Response.builder()
                .code(requestLevel.getCode())
                .msg(requestLevel.getName())
                .build();
        return res;
    }
}
