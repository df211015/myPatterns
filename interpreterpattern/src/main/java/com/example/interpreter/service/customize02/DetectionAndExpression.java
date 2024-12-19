package com.example.interpreter.service.customize02;

import org.apache.commons.lang.StringUtils;

import java.util.List;

public class DetectionAndExpression extends DetectionExpression {
    private DetectionExpression detectionItemNameExpression;
    private List<DetectionExpression> lstExceptionExpression;

    public DetectionAndExpression(DetectionExpression detectionItemNameExpressionPlus, List<DetectionExpression> lstExceptionExpressionPlus) {
        this.detectionItemNameExpression = detectionItemNameExpressionPlus;
        this.lstExceptionExpression = lstExceptionExpressionPlus;
    }

    /**
     * 以或的逻辑进行比较,满足其中一个规则即结束
     *
     * @param context
     * @return
     */
    @Override
    public Boolean interpret(String context) {
        if (StringUtils.isNotBlank(context)) {
            Boolean detectionItemNameFlag = this.detectionItemNameExpression.interpret(context);
            if (detectionItemNameFlag) {
                Boolean ruleFlag = Boolean.FALSE;
                for (DetectionExpression item : this.lstExceptionExpression) {
                    Boolean interpretFlag = item.interpret(context);
                    if (interpretFlag) {
                        ruleFlag = Boolean.TRUE;
                        break;
                    }
                }

                return detectionItemNameFlag && ruleFlag;
            }
        }

        return Boolean.FALSE;
    }
}
