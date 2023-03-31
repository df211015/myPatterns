package com.example.pattern.templatepattern.service.simple;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
