package com.example.chainpattern.service.v4;

public class Request4 extends AbstractRequest<String, Integer> {
    public Request4(String object) {
        super(object);
    }

    @Override
    public String getContent() {
        return super.getContent();
    }

    @Override
    public Integer getRequestLevel() {
        return 4;
    }
}
