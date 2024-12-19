package com.example.interpreter.service.customize03;

public interface Expression {
    /**
     * 解释年龄
     *
     * @param age
     * @return
     */
    Boolean interpret(Integer age);

    /**
     * 解释身高
     *
     * @param height
     * @return
     */
    Boolean interpret(Double height);
}
