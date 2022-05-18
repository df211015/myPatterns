package com.example.specificationpattern.service.impl;

import com.example.specificationpattern.service.CompositeSpecification;
import com.example.specificationpattern.service.ISpecification;

public class NotSpecification extends CompositeSpecification {
    private ISpecification spec;

    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !this.spec.isSatisfiedBy(candidate);
    }
}
