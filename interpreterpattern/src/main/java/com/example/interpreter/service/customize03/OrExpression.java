package com.example.interpreter.service.customize03;

public class OrExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public Boolean interpret(Integer age) {
        return this.expression1.interpret(age) || this.expression2.interpret(age);
    }

    @Override
    public Boolean interpret(Double height) {
        return this.expression1.interpret(height) || this.expression2.interpret(height);
    }
}
