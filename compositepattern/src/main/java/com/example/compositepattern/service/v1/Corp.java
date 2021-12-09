package com.example.compositepattern.service.v1;

import lombok.Data;

@Data
public abstract class Corp {
    //公司每个人都有名称
    private String name;
    //公司每个人都职位
    private String position;
    //公司每个人都有薪水
    private Integer salary;

    public Corp(String _name, String _position, Integer _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    //获得员工信息
    public String getInfo() {
        String info = String.format("姓名:%s,职位:%s,薪水:%s", this.name, this.position, this.salary);
        return info;
    }
}
