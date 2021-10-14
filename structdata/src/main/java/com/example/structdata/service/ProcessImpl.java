package com.example.structdata.service;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class ProcessImpl implements IProcess {
    @Override
    public void process() {
        //坐标 正值为右下
        ImgUtil.pressText(
                FileUtil.file("C:\\Users\\liudengfeng\\Desktop\\imgtest\\testpackage.jpg"),
                FileUtil.file("C:\\Users\\liudengfeng\\Desktop\\imgtest\\testpackage_new.jpg"),
                "版权所有", Color.WHITE, //文字
                new Font("黑体", Font.BOLD, 100), //字体
                0, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
                -200, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
                0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
        );

        System.out.println("处理完成!");
    }
}
