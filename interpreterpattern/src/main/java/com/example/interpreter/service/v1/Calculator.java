package com.example.interpreter.service.v1;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 计算器
 */
public class Calculator {
    private Expression expression;

    /**
     * @param expStr
     */
    public Calculator(String expStr) {
        //定义一个堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<Expression>();

        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        //运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    //加法结果放到堆栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                case '*':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new MultiExpression(left, right));
                    break;
                case '/':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new DivExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        int interpreter = this.expression.interpreter(var);
        return interpreter;
    }
}