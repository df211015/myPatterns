package com.example.chainpattern.service.v2;

import com.alibaba.fastjson.JSON;
import com.example.chainpattern.domain.ApplyInfo;

/**
 * 项目经理审批
 */
public class ProjectManager extends ApplyHandler {

    public ProjectManager(ApplyInfo applyInfo) {
        super(applyInfo);
    }

    @Override
    public void audit() {
        System.out.println(String.format("申请详情:%s,项目经理审批通过!", JSON.toJSON(super.getApplyInfo())));
    }

    @Override
    public Boolean check() {
        if (null == super.getApplyInfo()) {
            return Boolean.FALSE;
        }

        Integer vacationDays = super.getApplyInfo().getVacationDays();
        if (vacationDays <= 3) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
