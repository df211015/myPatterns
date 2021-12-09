package com.example.service.pk2;

public abstract class Colleague {
    public Mediator getMediator() {
        return mediator;
    }

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg);

    public abstract void notify(String msg);
}
