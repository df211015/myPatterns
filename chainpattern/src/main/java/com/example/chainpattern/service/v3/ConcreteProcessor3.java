package com.example.chainpattern.service.v3;

public class ConcreteProcessor3 extends Processor {
    @Override
    public Integer process(Integer input) {
        // 可以处理,返回结果
        if (input.equals(3)) return 3;

        if (null != super.successor) {
            return super.successor.process(input);
        }
        return -1;
    }
}