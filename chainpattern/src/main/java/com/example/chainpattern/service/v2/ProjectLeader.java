package com.example.chainpattern.service.v2;

import com.alibaba.fastjson.JSON;
import com.example.chainpattern.domain.ApplyInfo;

/**
 * 项目主管审核
 */
public class ProjectLeader extends ApplyHandler {

    public ProjectLeader(ApplyInfo applyInfo) {
        super(applyInfo);
    }

    @Override
    public void audit() {
        System.out.println(String.format("申请详情:%s,项目主管审批通过!", JSON.toJSON(super.getApplyInfo())));
    }

    @Override
    public Boolean check() {
        if (null == super.getApplyInfo()) {
            return Boolean.FALSE;
        }

        Integer vacationDays = super.getApplyInfo().getVacationDays();
        if (vacationDays > 3 && vacationDays <= 5) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;

    }
}
