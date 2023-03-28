package com.example.adapterpattern.service.customize;

public class Adapter implements ISport {
    private IOtherSport otherSport;

    public Adapter(IOtherSport otherSport) {
        this.otherSport = otherSport;
    }

    @Override
    public void sport() {
        //适配成ISport对像
        this.otherSport.play();
    }
}
