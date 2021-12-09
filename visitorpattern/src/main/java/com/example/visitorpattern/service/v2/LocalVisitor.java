package com.example.visitorpattern.service.v2;

import com.alibaba.fastjson.JSON;

public class LocalVisitor implements IVisitor {
    @Override
    public void visit(Animal animal) {
        if (null != animal) {
//            System.out.println(String.format("特种说明:%s", JSON.toJSONString(animal)));
            System.out.println(String.format("对象详情输出:%s", JSON.toJSONString(animal)));
        } else {
            System.out.println("对像为空");
        }
    }
}
