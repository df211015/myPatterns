package com.example.service.pk2;

public abstract class Mediator {
    private Colleague colleague1 = null;
    private Colleague colleague2 = null;

    public Colleague getColleague1() {
        return colleague1;
    }

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public Colleague getColleague2() {
        return colleague2;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    public abstract void send(Colleague colleague, String msg);
}
