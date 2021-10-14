package com.example.service.pk1;

/**
 * 同事类
 */
public abstract class Colleague {
    /**
     * 中介者
     */
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
