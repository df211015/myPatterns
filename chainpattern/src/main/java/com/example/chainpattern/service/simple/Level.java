package com.example.chainpattern.service.simple;

import lombok.Data;

public enum Level {
    first(1, "fist"),
    seconde(2, "second"),
    third(3, "third"),
    ;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer code;
    private String name;

    Level(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static Level findLevel(Integer code) {
        if (null == code) {
            return null;
        }
        for (Level level : Level.values()) {
            if (level.getCode().equals(code)) {
                return level;
            }
        }

        return null;
    }
}
