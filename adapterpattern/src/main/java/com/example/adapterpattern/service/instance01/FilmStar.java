package com.example.adapterpattern.service.instance01;

/**
 * target
 */
public class FilmStar implements IStar {
    public void act(String context) {
        System.out.println(String.format("明星演戏:%s", context));
    }
}
