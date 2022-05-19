package com.example.specificationpattern.service;

import com.example.specificationpattern.service.impl.AndSpecification;
import com.example.specificationpattern.service.impl.NotSpecification;
import com.example.specificationpattern.service.impl.OrSpecification;

public abstract class CompositeSpecification<T> implements ISpecification<T> {

    public abstract boolean isSatisfiedBy(T candidate);

    @Override
    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    @Override
    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }

    @Override
    public ISpecification not() {
        return new NotSpecification(this);
    }
}
