package com.example.structdata.service;

import com.example.structdata.dto.CityInfoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTest {


    public static void main(String[] args) {
        String strCityInfo = "1,郑州,410100;2,沈阳,210100;3,淄博,370300;4,东莞,441900;5,大连,210200;6,长沙,430100;7,昆明,530100;8,南宁,450100;9,长春,220100;10,西安,610100;11,成都,510100;12,银川,640100;13,杭州,330100;14,石家庄,130100;15,柳州,450200;16,南昌,360100;17,惠州,441300;18,佛山,440600;19,重庆,500100;20,苏州,320500;21,贵阳,520100;22,泉州,350500;23,合肥,340100;24,青岛,370200;25,海口,460100;26,太原,140100;27,兰州,620100;28,厦门,350200;29,济南,370100;30,天津,120100";
        String[] split = strCityInfo.split(";");
        List<CityInfoDto> list = new ArrayList<>();
        Map<Integer, CityInfoDto> map = new HashMap<>();
        CityInfoDto cityInfoDto = null;
        for (String item : split) {
            String[] itemInfo = item.split(",");
            cityInfoDto = new CityInfoDto();
            cityInfoDto.setIndex(Integer.valueOf(itemInfo[0]));
            cityInfoDto.setName(itemInfo[1]);
            cityInfoDto.setCode(Integer.valueOf(itemInfo[2]));
            list.add(cityInfoDto);

            map.put(cityInfoDto.getCode(), cityInfoDto);
        }

        for (int row = 1; row < 31; row++) {
            for (int col = row; col >= 1; col--) {

            }
        }

        String str = "";
    }
}
