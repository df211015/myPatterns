package com.example.interpreter.service.customize03;

public class TerminalExpression implements Expression {
    private Integer age;
    private Double height;
    private final Compare compare;

    public TerminalExpression(Integer age, Compare compare) {
        this.age = age;
        this.compare = compare;
    }

    public TerminalExpression(Double height, Compare compare) {
        this.height = height;
        this.compare = compare;
    }

    @Override
    public Boolean interpret(Integer age) {
        switch (this.compare) {
            case GT:
                return age.intValue() > this.age.intValue();
            case EQ:
                return age.equals(this.age);
            case LT:
                return age.intValue() < this.age.intValue();
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public Boolean interpret(Double height) {
        switch (this.compare) {
            case GT:
                return height.doubleValue() > this.height.doubleValue();
            case EQ:
                return height.equals(this.height);
            case LT:
                return height.doubleValue() < this.height.doubleValue();
            default:
                return Boolean.FALSE;
        }
    }
}
