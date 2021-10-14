package com.example.flyweightpattern.service.instance03;

public class CaptchaArgs {
    private Integer width;
    private Integer height;
    /**
     * 复杂度
     */
    private String complexity;

    public CaptchaArgs(Integer width, Integer height, String complexity) {
        this.width = width;
        this.height = height;
        this.complexity = complexity;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }
}
