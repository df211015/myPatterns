package com.example.chainpattern.service.v1;

public abstract class Handler {
    public final static Integer FATHER_LEVEL_REQUEST = 1;
    public final static Integer HUSBAND_LEVEL_REQUEST = 2;
    public final static Integer SON_LEVEL_REQEUST = 3;

    private Integer level;
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler(Integer level){
        this.level = level;
    }

    public final void HandleMessage(IWomen women) {
        if (women.getType().equals(this.level)) {
            this.response(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandleMessage(women);
            }else{
                System.out.println("---没地方请求了,按不同意处理---\n");
            }
        }
    }

    protected abstract void response(IWomen women);
}
