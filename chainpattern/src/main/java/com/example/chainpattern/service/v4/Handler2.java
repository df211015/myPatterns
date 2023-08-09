package com.example.chainpattern.service.v4;

import com.alibaba.fastjson.JSON;

public class Handler2 extends AbstractHandler {
    @Override
    protected Integer getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(String.format("Handler2处理,入参:%s", JSON.toJSONString(request)));
    }
}
