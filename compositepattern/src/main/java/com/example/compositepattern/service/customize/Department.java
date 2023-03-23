package com.example.compositepattern.service.customize;

public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(String.format("--- %s", super.getName()));
    }
}
