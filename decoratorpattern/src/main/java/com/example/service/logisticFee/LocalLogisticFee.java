package com.example.service.logisticFee;

import org.springframework.stereotype.Service;

@Service(value = "LocalLogisticFee")
public class LocalLogisticFee extends BaseDataInfo {

    @Override
    public void process(String data) {
        String str = String.format("LocalLogisticFee:%s", data);
        System.out.println(str);
    }
}
