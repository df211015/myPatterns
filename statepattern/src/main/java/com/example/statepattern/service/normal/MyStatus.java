package com.example.statepattern.service.normal;

public abstract class MyStatus {
    private MyContext myContext;

    public MyContext getMyContext() {
        return myContext;
    }

    public void setMyContext(MyContext myContext) {
        this.myContext = myContext;
    }

    public abstract void operate();
}