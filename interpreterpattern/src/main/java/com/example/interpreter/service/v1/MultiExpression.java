package com.example.interpreter.service.v1;

import java.util.HashMap;

/**
 *
 */
public class MultiExpression extends SymbolExpression {

    public MultiExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) * super.right.interpreter(var);
    }
}
