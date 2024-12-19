package com.example.interpreter.service.customize03;

public class Free {
    private Expression ageExpression;
    private Expression heightExpression;

    /**
     * 设置标准
     *
     * @param age
     * @param height
     */
    public Free(Integer age, Double height) {
        //大于等于设定年龄
        Expression expression1 = new TerminalExpression(age, Compare.GT);
        Expression expression2 = new TerminalExpression(age, Compare.EQ);
        this.ageExpression = new OrExpression(expression1, expression2);
        //小于等于设定身高
        Expression expression3 = new TerminalExpression(height, Compare.LT);
        Expression expression4 = new TerminalExpression(height, Compare.EQ);
        this.heightExpression = new OrExpression(expression3, expression4);
    }

    /**
     * 获取判定结果
     *
     * @param age
     * @param height
     * @return
     */
    public Boolean result(Integer age, Double height) {
        return this.ageExpression.interpret(age) || this.heightExpression.interpret(height);
    }
}
