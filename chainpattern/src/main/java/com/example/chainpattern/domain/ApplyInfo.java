package com.example.chainpattern.domain;

import lombok.Builder;
import lombok.Data;

/**
 * 申请明细
 */
@Data
@Builder
public class ApplyInfo {
    /**
     * 申请的假期的天数
     */
    private Integer vacationDays;

    /**
     * 请假备注
     */
    private String remark;
}
