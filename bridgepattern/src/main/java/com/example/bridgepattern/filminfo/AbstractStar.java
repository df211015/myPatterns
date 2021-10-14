package com.example.bridgepattern.filminfo;

public abstract class AbstractStar {
    protected final AbstractAction action;

    public AbstractStar(AbstractAction action) {
        this.action = action;
    }

    public void doJob() {
        this.action.desc();
    }
}
