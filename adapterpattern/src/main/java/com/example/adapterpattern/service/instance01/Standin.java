package com.example.adapterpattern.service.instance01;

/**
 * 适配器类，对像适配器
 */
public class Standin implements IStar {
    private IActor actor;

    public Standin(IActor actor) {
        this.actor = actor;
    }

    @Override
    public void act(String context) {
        this.actor.playact(context);
    }
}
