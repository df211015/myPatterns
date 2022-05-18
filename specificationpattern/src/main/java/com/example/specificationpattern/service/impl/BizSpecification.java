package com.example.specificationpattern.service.impl;

import com.example.specificationpattern.service.CompositeSpecification;

public class BizSpecification extends CompositeSpecification {
    //基准对像
    private Object obj;

    public BizSpecification(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        //todo, 根据基准对像和候选对像进行业务判断，返回boolean

        return false;
    }
}
