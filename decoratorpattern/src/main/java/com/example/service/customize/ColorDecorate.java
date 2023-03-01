package com.example.service.customize;

public class ColorDecorate extends Decorate {

    public ColorDecorate(AbsWatch watch) {
        super(watch);
    }

    @Override
    public void displayTime() {
        super.displayTime();
        this.addColor();
    }

    private void addColor(){
        System.out.println("add red for Garmin");
    }
}
