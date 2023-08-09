package com.example.chainpattern.service.v4;

public abstract class AbstractRequest<T, R> {
    private T object;

    public AbstractRequest(T object) {
        this.object = object;
    }

    public T getContent() {
        return this.object;
    }

    public abstract R getRequestLevel();
}
