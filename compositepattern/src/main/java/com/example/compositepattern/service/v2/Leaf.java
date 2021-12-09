package com.example.compositepattern.service.v2;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        return;
    }

    @Override
    public void remove(Component component) {
        return;
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
    }
}
