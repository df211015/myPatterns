package com.example.specificationpattern.service;

public interface ISpecification {
    boolean isSatisfiedBy(Object candidate);

    ISpecification and(ISpecification spec);

    ISpecification or(ISpecification spec);

    ISpecification not();
}
