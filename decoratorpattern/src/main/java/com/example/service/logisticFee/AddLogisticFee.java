package com.example.service.logisticFee;

public class AddLogisticFee extends DecoratorFee {

    public AddLogisticFee(BaseDataInfo baseDataInfo) {
        super(baseDataInfo);
    }

    private void addFee() {
        System.out.println(String.format("装饰类AddLogisticFee执行了方法->%s", "addFee"));
    }

    @Override
    public void process(String data) {
        super.process(data);
        this.addFee();
    }
}
