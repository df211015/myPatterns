package com.example.chainpattern.service.v1;

public class Son extends Handler {
    public Son(){
        super(Handler.SON_LEVEL_REQEUST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---母亲向儿子请求---");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
