package com.example.interpreter.service.simple;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public Integer interpreter(HashMap<String, Integer> var) {
        if (StringUtils.isNotBlank(this.key)) {
            return var.get(this.key);
        }

        return null;
    }
}
