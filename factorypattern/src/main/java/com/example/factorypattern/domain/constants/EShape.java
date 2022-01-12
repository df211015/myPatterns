package com.example.factorypattern.domain.constants;

public enum EShape {
    circle(1, "圆形"),
    rect(2, "矩形"),
    tri(3, "三角形"),
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

    EShape(Integer index, String description) {
        this.index = index;
        this.description = description;
    }
}
