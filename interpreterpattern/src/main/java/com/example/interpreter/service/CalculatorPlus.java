package com.example.interpreter.service;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class CalculatorPlus {
    //构建语法树
    private Expression expression;

    public CalculatorPlus(String expStr) {
        Stack<Expression> operandStack = new Stack<Expression>();
        //操作符
        Stack<String> operatorStack = new Stack<>();

        char[] arrExp = expStr.toCharArray();
        List<String> arrItem = Arrays.asList(arrExp).stream().map(r -> String.valueOf(r)).collect(Collectors.toList());
        for (String item : arrItem) {
            if (StringUtils.isBlank(item)) {
                continue;
            }
            if (item.equals("+") || item.equals("-")) {
                while (!operatorStack.isEmpty() && (operatorStack.peek().equals("+") ||
                        operatorStack.peek().equals("-") ||
                        operatorStack.peek().equals("*") ||
                        operatorStack.peek().equals("/"))) {
                    this.processOperator(operandStack, operatorStack);
                }
                operatorStack.push(item);
            } else if (item.equals("*") || item.equals("/")) {
                while (!operatorStack.isEmpty() && (operatorStack.peek().equals("*") ||
                        operatorStack.peek().equals("/"))) {
                    this.processOperator(operandStack, operatorStack);
                }
                operatorStack.push(item);
            } else if (item.equals("(")) {
                operatorStack.push(item);
            } else if (item.equals(")")) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    this.processOperator(operandStack, operatorStack);
                }
                operatorStack.pop();
            } else {
                operandStack.push(new VarExpression(item));
            }
        }

        while (!operatorStack.isEmpty()) {
            this.processOperator(operandStack, operatorStack);
        }

        this.expression = operandStack.pop();
    }

    private void processOperator(Stack<Expression> operandStack, Stack<String> operatorStack) {
        String operator = operatorStack.pop();
        Expression right = operandStack.pop();
        Expression left = operandStack.pop();
        switch (operator) {
            case "+":
                operandStack.push(new AddExpression(left, right));
                break;
            case "-":
                operandStack.push(new SubExpression(left, right));
                break;
            case "*":
                operandStack.push(new MultiExpression(left, right));
                break;
            case "/":
                operandStack.push(new DivExpression(left, right));
                break;
        }
    }

    public int run(HashMap<String, Integer> var) {
        int interpreter = this.expression.interpreter(var);
        return interpreter;
    }
}
