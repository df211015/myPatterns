package com.example.service.actor;

public class Decorator implements IStar {
    private IStar star;

    public Decorator(IStar star) {
        this.star = star;
    }

    @Override
    public void act() {
        this.star.act();
    }
}
