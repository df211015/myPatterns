package com.example.compositepattern.service;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {
    private List<Corp> list = new ArrayList<>();
    public Branch(String _name, String _position, Integer _salary) {
        super(_name, _position, _salary);
    }

    public void addSubordinate(Corp corp){
        this.list.add(corp);
    }

    public List<Corp> getSubordinate() {
        return this.list;
    }
}
