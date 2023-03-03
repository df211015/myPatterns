package com.example.bridgepattern.service.customize;

public abstract class AbsFatherRequest {
    private AbsSonResponse sonResponse;

    public AbsFatherRequest(AbsSonResponse sonResponse) {
        this.sonResponse = sonResponse;
    }

    public void sonResponseProcess() {
        this.fatherRequest();
        if (null != this.sonResponse) {
            this.sonResponse.sonResponse();
        }
    }

    public abstract void fatherRequest();
}
