package com.example.service.customize;

public class FilmingDecorate extends Decorate {
    public FilmingDecorate(AbsWatch watch) {
        super(watch);
    }

    @Override
    public void displayTime() {
        super.displayTime();
        this.addFilming();
    }

    private void addFilming() {
        System.out.println("add filming for Garmin");
    }
}
