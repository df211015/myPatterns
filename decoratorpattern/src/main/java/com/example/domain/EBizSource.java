package com.example.domain;

public enum EBizSource {
    c2b("C2B"),
    mendian("门店"),
    ydg("异地购"),
    crm("crm"),
    promotion("promotion"),
    mendianoffline("mendianoffline"),
    reportcache("reportcache"),
    vehiclesnapshot("vehiclesnapshot"),
    ydgreonline("ydgreonline"),
    mendianreonline("mendianreonline"),
    //车源移库
    vehicletransfer("vehicletransfer"),
    //车源采购阶段调用定价中心
    invokepricecenter("invokepricecenter"),
    //车源上架阶段调用定价中心
    invokepricecenterofsale("invokepricecenterofsale"),
    //车源销售方式变更
    saleapproachchange("saleapproachchange"),
    //车源销售状态为在售时进行分发处理
    promotionbysalestatus("promotionbysalestatus"),
    //实车停售或下架时虚车处理
    virtualvehicleprocess("virtualvehicleprocess"),
    //车源审核通过且需要复制影子车源
    vehicleonlinecopycar("vehicleonlinecopycar"),
    //车源上架状态为重新上架
    vehicleonsalestatusreonline("vehicleonsalestatusreonline"),
    //车源上架状态为下架
    vehicleonsalestatusoffline("vehicleonsalestatusoffline");

    public String getDescribe() {
        return describe;
    }

    private String describe;

    EBizSource(String describe) {
        this.describe=describe;
    }
}
