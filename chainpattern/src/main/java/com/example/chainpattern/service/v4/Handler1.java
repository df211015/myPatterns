package com.example.chainpattern.service.v4;

import com.alibaba.fastjson.JSON;

public class Handler1 extends AbstractHandler{
    @Override
    protected Integer getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(String.format("Handler1处理,入参:%s", JSON.toJSONString(request)));
    }
}
