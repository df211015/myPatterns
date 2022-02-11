package com.example.domain;

/**
 * 出租类型
 */
public enum ERentType {
    Small_House(1, "一室一厅"),
    Normal_House(2, "两室一厅"),
    Big_House(3, "三室两厅"),
    ;

    private Integer code;
    private String desc;

    ERentType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
