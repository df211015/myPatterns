package com.example.specificationpattern.service.impl.biz;

import com.example.specificationpattern.domain.UserInfo;
import com.example.specificationpattern.service.CompositeSpecification;

public class BizSpecificationOfEquals<T> extends CompositeSpecification<T> {
    private String condition;

    public BizSpecificationOfEquals(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        if (candidate instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) candidate;
            return this.condition.trim().equals(userInfo.getUserName());
        }

        return false;
    }
}
