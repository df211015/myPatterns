package com.example.service.logisticFee;

public class DecoratorFee extends BaseDataInfo {
    private BaseDataInfo baseDataInfo;

    public DecoratorFee(BaseDataInfo baseDataInfo) {
        this.baseDataInfo = baseDataInfo;
    }

    @Override
    public void process(String data) {
        this.baseDataInfo.process(data);
    }
}
