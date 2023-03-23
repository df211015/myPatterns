package com.example.compositepattern.service.customize;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        this.organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        this.organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(String.format("- %s", super.getName()));
        for (OrganizationComponent organizationComponent : this.organizationComponents) {
            organizationComponent.print();
        }
    }
}
