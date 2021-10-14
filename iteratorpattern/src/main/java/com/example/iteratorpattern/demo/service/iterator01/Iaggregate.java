package com.example.iteratorpattern.demo.service.iterator01;

public interface Iaggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}