package com.example.compositepattern.service.customize;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("--------------" + super.getName() + "--------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
