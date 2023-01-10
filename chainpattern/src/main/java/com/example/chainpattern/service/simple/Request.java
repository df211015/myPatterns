package com.example.chainpattern.service.simple;

import lombok.Data;

@Data
public class Request {
    private Integer level;

    public Request(Integer level) {
        this.level = level;
    }

    //请求的等级
    public Level getRequestLevel() {
        Level item = Level.findLevel(this.level);
        return item;
    }
}
