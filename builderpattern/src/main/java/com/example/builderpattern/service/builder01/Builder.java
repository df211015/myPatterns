package com.example.builderpattern.service.builder01;

public abstract class Builder {
    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body){
        this.superMan.setBody(body);
    }

    public void setSpectialTalent(String st){
        this.superMan.setSpecialTalent(st);
    }

    public void setSpecialSymbol(String ss){
        this.superMan.setSpecialSysmbol(ss);
    }

    public abstract SuperMan getSuperMan();
}