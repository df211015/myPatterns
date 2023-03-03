package com.example.bridgepattern.service.customize;

public class FatherRequest extends AbsFatherRequest {

    public FatherRequest(AbsSonResponse sonResponse) {
        super(sonResponse);
    }

    @Override
    public void fatherRequest() {
        System.out.println("Father's request");
    }
}
