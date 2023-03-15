package com.example.visitorpattern.service.customize;

import lombok.Data;

@Data
public class ElementPlus {
    private String name;
    private String level;
    private Double score;

    public void accept(IVisitorPlus visitor) {
        visitor.visit(this);
    }
}