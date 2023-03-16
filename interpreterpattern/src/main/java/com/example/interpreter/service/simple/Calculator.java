package com.example.interpreter.service.simple;

import com.example.interpreter.service.simple.AddExpression;
import com.example.interpreter.service.simple.SubExpression;
import com.example.interpreter.service.simple.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        //定义一个堆栈，安排运算的先后顺序
        Stack<com.example.interpreter.service.simple.Expression> stack = new Stack<com.example.interpreter.service.simple.Expression>();

        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        //运算
        com.example.interpreter.service.simple.Expression left = null;
        com.example.interpreter.service.simple.Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new com.example.interpreter.service.simple.VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new com.example.interpreter.service.simple.VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
