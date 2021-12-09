package com.example.visitorpattern.service.v2;

public abstract class Animal {
    private String name;
    private String features;
    private String description;

    public Animal() {
    }

    public Animal(String name, String features, String description) {
        this.name = name;
        this.features = features;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getFeatures() {
        return features;
    }

    public String getDescription() {
        return description;
    }

    public abstract void getAdvantages();

    public abstract void visit(IVisitor visitor);
}
