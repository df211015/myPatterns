package com.example.prototypepattern.servrice.instance02;

/**
 *
 */
public class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
