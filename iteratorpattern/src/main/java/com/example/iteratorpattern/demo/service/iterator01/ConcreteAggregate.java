package com.example.iteratorpattern.demo.service.iterator01;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Iaggregate {
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        this.list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        this.list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
