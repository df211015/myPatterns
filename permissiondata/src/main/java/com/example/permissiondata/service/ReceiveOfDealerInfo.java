package com.example.permissiondata.service;

import com.alibaba.fastjson.JSON;
import com.example.permissiondata.constants.ProjConstants;
import com.example.permissiondata.dto.DealerBaseInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Slf4j
//@Service("receiveOfDealerInfo")
public class ReceiveOfDealerInfo extends MyReceiver {
    //经销商数据文件
    private final String Dealer_Info = "dealer_info";

    //经销商基本信息
    private List<DealerBaseInfo> lstDealerBaseInfo = new ArrayList<>();

    private final String insertTemplateSql = "insert into dealer_base_info (dealer_id, dealer_taoche_id, dealer_name, dealer_type, dealer_tag, dealer_province_id, dealer_province_name, dealer_city_id, dealer_city_name, dealer_district_id,dealer_district_name, dealer_status, is_check_vin, is_data_join, create_time, update_time, operater_name, is_delete) " +
            "values (%s, %s, '%s', %s, %s, %s, '%s', %s, '%s', %s, '%s', %s, %s, %s, '%s', '%s', '%s', %s);\r\n";

    @Autowired
    public ReceiveOfDealerInfo() {
        super.getData();
    }

    /**
     * 初始化数据
     * 数据以#开头的为注释,实际数据初始化会忽略该行
     *
     * @throws IOException
     */
    @Override
    public void loadTaskFile() throws IOException {
        ClassPathResource classPathResourceOfDealerInfo = new ClassPathResource(this.Dealer_Info);
        InputStream inputStreamOfDealerInfo = classPathResourceOfDealerInfo.getInputStream();
        BufferedReader readerOfDealerInfo = new BufferedReader(new InputStreamReader(inputStreamOfDealerInfo, "UTF-8"));

        Integer iCount = 0;
        String strDealerInfoTmp;
        String myTime = super.getMyCalenderStr();
        while ((strDealerInfoTmp = readerOfDealerInfo.readLine()) != null) {
            if (StringUtils.isNotBlank(strDealerInfoTmp)) {
                if (!strDealerInfoTmp.startsWith("#")) {
                    iCount++;
                    String[] arrDealerItems = strDealerInfoTmp.split(",", -1);
                    DealerBaseInfo dealerBaseInfo = this.buildDealerBaseInfo(arrDealerItems, myTime);
                    long count = this.lstDealerBaseInfo.stream().filter(r -> r.getDealerId() != null && r.getDealerId().equals(dealerBaseInfo.getDealerId())).count();
                    if (count <= 0) {
                        this.lstDealerBaseInfo.add(dealerBaseInfo);
                    } else {
                        log.info(String.format("会员信息重复,会员详情:%s", JSON.toJSONString(dealerBaseInfo)));
                    }
                    log.info(String.format("处理会员数据记录数量:%s", iCount));
                }
            }
        }

        readerOfDealerInfo.close();
    }

    @Override
    public String process() {
        StringBuilder sbSql = new StringBuilder();
        sbSql.append("-- 输出会员信息sql脚本......\r\n");
        for (DealerBaseInfo item : this.lstDealerBaseInfo) {
            sbSql.append(String.format(this.insertTemplateSql,
                    item.getDealerId(), item.getDealerTaocheId(), item.getDealerName(), item.getDealerType(),
                    item.getDealerTag(), item.getDealerProvinceId(), item.getDealerProvinceName(), item.getDealerCityId(),
                    item.getDealerCityName(), item.getDealerDistrictId(), item.getDealerDistrictName(), item.getDealerStatus(),
                    item.getIsCheckVin(), item.getIsDataJoin(), item.getCreateTime(), item.getUpdateTime(),
                    item.getOperaterName(), item.getIsDelete()));
        }
        String mySql = sbSql.toString();

        return mySql;
    }

    /**
     * 构建 DealerBaseInfo
     *
     * @param arrDealerItems
     * @param myTime         初始化时间
     * @return
     */
    private DealerBaseInfo buildDealerBaseInfo(String[] arrDealerItems, String myTime) {
        DealerBaseInfo dealerBaseInfo = new DealerBaseInfo();
        dealerBaseInfo.setDealerId(Integer.parseInt(String.valueOf(arrDealerItems[0])));
        Integer dealerTaocheId = null;
        if (StringUtils.isNotBlank(arrDealerItems[1]) && !ProjConstants.STR_NULL.equals(arrDealerItems[1])) {
            dealerTaocheId = Integer.parseInt(String.valueOf(arrDealerItems[1]));
        }
        dealerBaseInfo.setDealerTaocheId(dealerTaocheId);
        String dealerName = StringUtils.EMPTY;
        if (StringUtils.isNotBlank(arrDealerItems[2]) && !ProjConstants.STR_NULL.equals(arrDealerItems[2])) {
            dealerName = arrDealerItems[2].replace("'", "");
        }
        dealerBaseInfo.setDealerName(dealerName);
        Integer dealerType = this.transYiCheDealerType(Integer.parseInt(String.valueOf(arrDealerItems[3])));
        dealerBaseInfo.setDealerType(dealerType);
        Integer dealerTag = null;
        if (StringUtils.isNotBlank(arrDealerItems[4]) && !ProjConstants.STR_NULL.equals(arrDealerItems[4])) {
            dealerTag = Integer.parseInt(String.valueOf(arrDealerItems[4]));
        }
        dealerBaseInfo.setDealerTag(dealerTag);
        Integer dealerProvinceId = null;
        if (StringUtils.isNotBlank(arrDealerItems[5]) && !ProjConstants.STR_NULL.equals(arrDealerItems[5])) {
            dealerProvinceId = Integer.parseInt(String.valueOf(arrDealerItems[5]));
        }
        dealerBaseInfo.setDealerProvinceId(dealerProvinceId);
        String dealerProvinceName = StringUtils.EMPTY;
        if (StringUtils.isNotBlank(arrDealerItems[6])) {
            dealerProvinceName = arrDealerItems[6];
        }
        dealerBaseInfo.setDealerProvinceName(dealerProvinceName);
        Integer dealerCityId = null;
        if (StringUtils.isNotBlank(arrDealerItems[7]) && !ProjConstants.STR_NULL.equals(arrDealerItems[7])) {
            dealerCityId = Integer.parseInt(String.valueOf(arrDealerItems[7]));
        }
        dealerBaseInfo.setDealerCityId(dealerCityId);
        String dealerCityName = StringUtils.EMPTY;
        if (StringUtils.isNotBlank(arrDealerItems[8])) {
            dealerCityName = arrDealerItems[8];
        }
        dealerBaseInfo.setDealerCityName(dealerCityName);
        Integer districtId = null;
        if (StringUtils.isNotBlank(arrDealerItems[9]) && !ProjConstants.STR_NULL.equals(arrDealerItems[9])) {
            districtId = Integer.parseInt(String.valueOf(arrDealerItems[9]));
        }
        dealerBaseInfo.setDealerDistrictId(districtId);
        String districtName = StringUtils.EMPTY;
        if (StringUtils.isNotBlank(arrDealerItems[10]) && !ProjConstants.STR_NULL.equals(arrDealerItems[10])) {
            districtName = arrDealerItems[10];
        }
        dealerBaseInfo.setDealerDistrictName(districtName);
        dealerBaseInfo.setDealerStatus(ProjConstants.Dealer_Status);
        dealerBaseInfo.setIsCheckVin(ProjConstants.Dealer_Vincode_check_Yes);
        dealerBaseInfo.setIsDataJoin(ProjConstants.Dealer_Vincode_check_Yes);
        dealerBaseInfo.setCreateTime(myTime);
        dealerBaseInfo.setUpdateTime(myTime);
        dealerBaseInfo.setOperaterName(ProjConstants.OpereaterName);
        dealerBaseInfo.setIsDelete(ProjConstants.Is_Delete);

        return dealerBaseInfo;
    }

    /**
     * 根据淘车经销商类型转换为易车经销商类型
     *
     * @param type
     * @return
     */
    private Integer transYiCheDealerType(Integer type) {
        //默认中介
        int yicheDealerType = 8;
        switch (type) {
            case 1:
                //经纪人->经纪人
                yicheDealerType = 7;
                break;
            case 2:
                //4S店->4S店
                yicheDealerType = 2;
                break;
            case 3:
                //专业公司->经纪公司
                yicheDealerType = 6;
                break;
            case 7:
                //中介->中介
                yicheDealerType = 8;
                break;
        }
        return yicheDealerType;
    }
}
