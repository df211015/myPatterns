package com.example.permissiondata.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * dealer_base_info
 * @author 
 */
@Data
public class DealerBaseInfo implements Serializable {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 经销商id
     */
    private Integer dealerId;

    /**
     * 经销商淘车id
     */
    private Integer dealerTaocheId;

    /**
     * 经销商name
     */
    private String dealerName;

    /**
     * 经销商类型
     */
    private Integer dealerType;

    private Integer dealerTag;

    /**
     * 经销商所在省id
     */
    private Integer dealerProvinceId;

    /**
     * 经销商所在省名称
     */
    private String dealerProvinceName;

    /**
     * 经销商所在城市id
     */
    private Integer dealerCityId;

    /**
     * 经销商所在城市名称
     */
    private String dealerCityName;

    /**
     * 经销商所在地区id
     */
    private Integer dealerDistrictId;

    /**
     * 经销商所在地区名称
     */
    private String dealerDistrictName;

    /**
     * 经销商状态
     */
    private Integer dealerStatus;

    /**
     * 是否vin码排重,0:否,1:是
     */
    private Integer isCheckVin;

    /**
     * 是否作为vin验重数据源,0:否,1:是
     */
    private Integer isDataJoin;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 操作人Id
     */
    private String operaterId;

    /**
     * 操作人名称
     */
    private String operaterName;

    /**
     * 是否生效,0:生效,1:不生效
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}