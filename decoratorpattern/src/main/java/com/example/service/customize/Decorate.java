package com.example.service.customize;

public class Decorate extends AbsWatch {
    private AbsWatch watch;

    public Decorate(AbsWatch watch) {
        this.watch = watch;
    }

    @Override
    public void displayTime() {
        this.watch.displayTime();
    }
}