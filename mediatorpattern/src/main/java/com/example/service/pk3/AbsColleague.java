package com.example.service.pk3;

/**
 *
 */
public abstract class AbsColleague {
    private AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }

    public AbsMediator getMediator() {
        return mediator;
    }

    public abstract void selfProcess();
}
