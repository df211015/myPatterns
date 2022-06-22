package com.example.service.mysugar;

public class MySugar implements ISweetFood {

    @Override
    public String packageSugar(String name) {
        String sugarDesc = String.format("my sugar name：%s", name);
        System.out.println(sugarDesc);
        return sugarDesc;
    }
}
