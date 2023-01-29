package com.example.compositepattern.service.simple;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return this.components;
    }
}
