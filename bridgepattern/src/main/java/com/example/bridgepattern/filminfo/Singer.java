package com.example.bridgepattern.filminfo;

public class Singer extends AbstractStar {
    public Singer() {
        super(new Sing());
    }

    public Singer(AbstractAction action) {
        super(action);
    }

    @Override
    public void doJob() {
        super.doJob();
    }
}
