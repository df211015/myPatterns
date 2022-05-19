package com.example.specificationpattern.service;

public interface ISpecification<T> {
    boolean isSatisfiedBy(T candidate);

    ISpecification and(ISpecification spec);

    ISpecification or(ISpecification spec);

    ISpecification not();
}
