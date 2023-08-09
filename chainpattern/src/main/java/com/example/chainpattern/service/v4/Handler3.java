package com.example.chainpattern.service.v4;

import com.alibaba.fastjson.JSON;

public class Handler3 extends AbstractHandler {
    @Override
    protected Integer getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(String.format("Handler3处理,入参:%s", JSON.toJSONString(request)));
    }
}
