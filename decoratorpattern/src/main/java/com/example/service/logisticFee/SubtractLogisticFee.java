package com.example.service.logisticFee;

public class SubtractLogisticFee extends DecoratorFee {

    public SubtractLogisticFee(BaseDataInfo baseDataInfo) {
        super(baseDataInfo);
    }

    private void subtractFee(){
        System.out.println(String.format("装饰类SubtractLogisticFee执行了方法->%s","subtractFee"));
    }

    @Override
    public void process(String data) {
        super.process(data);
        this.subtractFee();
    }
}
