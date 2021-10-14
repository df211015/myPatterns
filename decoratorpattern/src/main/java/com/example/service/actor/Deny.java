package com.example.service.actor;

public class Deny extends Decorator {
    public Deny(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("演后:百般抵赖,死不承认");
    }
}
