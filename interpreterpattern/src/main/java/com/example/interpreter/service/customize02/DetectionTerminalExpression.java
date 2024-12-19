package com.example.interpreter.service.customize02;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;

public class DetectionTerminalExpression extends DetectionExpression {
    private List<String> lstdetectionItemExceptionName;

    public DetectionTerminalExpression(String detectionItemExceptionName) {
        this.lstdetectionItemExceptionName = Arrays.asList(detectionItemExceptionName.split(","));
    }

    @Override
    public Boolean interpret(String context) {
        if (StringUtils.isBlank(context)) {
            return Boolean.FALSE;
        }
        for (String detectionItemExceptionName : this.lstdetectionItemExceptionName) {
            if (StringUtils.isNotBlank(detectionItemExceptionName)) {
                boolean matches = context.matches(String.format(".*%s.*", detectionItemExceptionName));
                if (matches) {
                    return Boolean.TRUE;
                }
            }
        }

        return Boolean.FALSE;
    }
}
