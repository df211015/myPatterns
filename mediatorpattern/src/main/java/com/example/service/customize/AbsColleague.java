package com.example.service.customize;

public abstract class AbsColleague {
    public AbsMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbsMediator mediator) {
        this.mediator = mediator;
    }

    private AbsMediator mediator;

    public abstract void rent();
}
