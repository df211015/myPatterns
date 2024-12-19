package com.example.interpreter.service.customize02;

import lombok.Getter;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum ERetailStandardExceptionLevel {
    item_1000("1000", 1, "检测项001", "重大损伤"),
    item_1001("1000", 2, "检测项001", "一般损伤"),
    item_1002("1001", 1, "检测项002", "重大损伤"),
    ;

    private String detectionItemCode;
    private Integer exceptionCode;
    private String detectionItemName;
    private String exceptionName;

    ERetailStandardExceptionLevel(String detectionItemCode, Integer exceptionCode, String detectionItemName, String exceptionName) {
        this.detectionItemCode = detectionItemCode;
        this.exceptionCode = exceptionCode;
        this.detectionItemName = detectionItemName;
        this.exceptionName = exceptionName;
    }

    public static List<ERetailStandardExceptionLevel> findItems(String detectionItemCode) {
        if (StringUtils.isBlank(detectionItemCode)) {
            return null;
        }
        List<ERetailStandardExceptionLevel> lstResult = new ArrayList<>();
        for (ERetailStandardExceptionLevel e : ERetailStandardExceptionLevel.values()) {
            if (e.getDetectionItemCode().equals(detectionItemCode)) {
                lstResult.add(e);
            }
        }
        if (null != lstResult && lstResult.size() > 0) {
            return lstResult;
        }
        return null;
    }
}
