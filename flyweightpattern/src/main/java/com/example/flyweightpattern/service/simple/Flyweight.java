package com.example.flyweightpattern.service.simple;

public abstract class Flyweight {
    private String intrinsic;
    protected final String extrinsic;

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();
}
