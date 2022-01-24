package com.example.statepattern.domain;

public enum EMyStatus {
    STATUS_001(1, "状态1"),
    STATUS_002(2, "状态2"),
    STATUS_003(3, "状态3"),
    ;

    private Integer index;
    private String desc;

    EMyStatus(Integer index, String desc) {
        this.index = index;
        this.desc = desc;
    }
}
