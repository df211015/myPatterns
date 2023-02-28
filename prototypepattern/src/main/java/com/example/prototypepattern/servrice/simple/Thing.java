package com.example.prototypepattern.servrice.simple;

import java.util.ArrayList;

public class Thing implements Cloneable {
    public ArrayList<String> getValue() {
        return arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException ex) {

        }
        return thing;
    }
}
