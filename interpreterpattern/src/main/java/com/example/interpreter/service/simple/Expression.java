package com.example.interpreter.service.simple;

import java.util.HashMap;

/**
 * 区分终结表达式(变量)和非终结表达式(运算符)
 */
public abstract class Expression {
    public abstract Integer interpreter(HashMap<String, Integer> var);
}