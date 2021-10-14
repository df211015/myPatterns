package com.example.interpreter.service;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 减法表达式解析
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }

}
