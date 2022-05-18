package com.example.specificationpattern.service.impl;

import com.example.specificationpattern.service.CompositeSpecification;
import com.example.specificationpattern.service.ISpecification;

public class OrSpecification extends CompositeSpecification {
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return this.left.isSatisfiedBy(candidate) || this.right.isSatisfiedBy(candidate);
    }
}
