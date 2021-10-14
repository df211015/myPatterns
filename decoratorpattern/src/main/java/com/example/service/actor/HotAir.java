package com.example.service.actor;

/**
 *
 */
public class HotAir extends Decorator {
    public HotAir(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        System.out.println("演前:夸夸其谈,没有自己不能演的角色");
        super.act();
    }
}
