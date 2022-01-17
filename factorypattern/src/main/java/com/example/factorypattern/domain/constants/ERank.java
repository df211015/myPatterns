package com.example.factorypattern.domain.constants;

/**
 * 等级枚举
 */
public enum ERank {
    normal(1, "普通"),
    top(2, "顶级"),
    ;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Integer index;
    private String description;

    ERank(Integer index, String description) {
        this.index = index;
        this.description = description;
    }
}
