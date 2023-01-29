package com.example.compositepattern.service.simple;

import java.util.ArrayList;

public class Leaf extends Component {

    @Override
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
