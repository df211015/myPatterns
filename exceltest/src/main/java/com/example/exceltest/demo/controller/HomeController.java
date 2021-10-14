package com.example.exceltest.demo.controller;

import com.example.exceltest.demo.domain.dto.ReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "测试接口", tags = "测试接口")
@RestController
@RequestMapping("/home")
public class HomeController {

    @ApiOperation(value = "获取测试数据value", notes = "获取测试数据notes")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "操作人名称", dataType = "string", paramType = "query", required = true),
            @ApiImplicitParam(name = "level", value = "操作人等级", dataType = "int", paramType = "query")
    })
    @GetMapping("/get/index")
    public String myIndex(ReqDto reqDto) {
        return "myIndex";
    }
}
