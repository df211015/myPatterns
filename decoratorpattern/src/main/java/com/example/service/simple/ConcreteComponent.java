package com.example.service.simple;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent --> operate");
    }
}
