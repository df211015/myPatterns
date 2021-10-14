package com.example.iteratorpattern.demo.service.iterator01;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private Integer index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        Object obj = this.list.get(0);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < this.list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
