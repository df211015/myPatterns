package com.example.exceltest.demo.dao;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDao {
    public void save(List list) {
        System.out.println("list保存成功");
    }
}
