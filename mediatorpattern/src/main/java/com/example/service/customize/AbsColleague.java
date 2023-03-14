package com.example.service.customize;

public abstract class AbsColleague {
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void rent();
}
