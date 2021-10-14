package com.example.interpreter.service;

import java.util.HashMap;

/**
 *
 */
public class DivExpression extends SymbolExpression {

    public DivExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) / super.right.interpreter(var);
    }
}
