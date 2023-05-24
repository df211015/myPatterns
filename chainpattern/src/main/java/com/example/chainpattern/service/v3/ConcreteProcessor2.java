package com.example.chainpattern.service.v3;

public class ConcreteProcessor2 extends Processor {
    @Override
    public Integer process(Integer input) {
        // 可以处理,返回结果
        if (input.equals(2)) return 2;

        if (null != super.successor) {
            return super.successor.process(input);
        }
        return -1;
    }
}