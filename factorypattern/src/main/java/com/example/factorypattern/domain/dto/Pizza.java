package com.example.factorypattern.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza {
    private String name;

    public void displayPizza() {
        System.out.println("pizza");
    }
}
