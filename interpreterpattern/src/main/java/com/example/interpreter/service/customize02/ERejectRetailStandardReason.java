package com.example.interpreter.service.customize02;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ERejectRetailStandardReason {
    NRSRC1(1, "重大损伤"),
    NRSRC2(2, "一般损伤"),
    NRSRC3(3, "泡水车"),
    NRSRC4(4, "天窗漏水"),
    NRSRC5(5, "调表车"),
    NRSRC6(6, "冰雹车"),
    NRSRC7(7, "维保记录异常"),
    NRSRC8(8, "工况故障"),
    NRSRC9(9, "年限超限"),
    NRSRC10(10, "公里数超限"),
    NRSRC11(11, "过户次数超限");

    private Integer code;
    private String name;

    public static ERejectRetailStandardReason findItem(Integer code) {
        if (null == code) {
            return null;
        }
        for (ERejectRetailStandardReason e : ERejectRetailStandardReason.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }

        return null;
    }
}
