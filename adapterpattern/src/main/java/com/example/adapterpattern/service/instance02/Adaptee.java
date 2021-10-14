package com.example.adapterpattern.service.instance02;

import org.springframework.stereotype.Service;

@Service
public class Adaptee {
    /**
     * @param unid 统一车源id
     * @param type 类型
     */
    public void response_adaptee(String unid, Integer type) {
        System.out.println(String.format("Adaptee,response_adaptee,unid:%s,type:%s", unid, type));
    }
}
