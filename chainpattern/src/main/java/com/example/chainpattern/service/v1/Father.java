package com.example.chainpattern.service.v1;

public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---女儿向父亲请求---");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
