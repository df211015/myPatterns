package com.example.exceltest.demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.example.exceltest.demo.domain.entity.Student;
import com.example.exceltest.demo.service.StudentListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private StudentListener studentListener;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
//            File file = new File("D:\\localtest\\myPatterns\\exceltest\\mystudent.xlsx");
//            InputStream fileInputStream = new FileInputStream(file);
            //写法一
            // sheet里面可以传参 根据sheet下标读取或者根据名字读取 不传默认读取第一个
            /*EasyExcel.read(fileInputStream, Student.class, this.studentListener).sheet().doRead();*/

//            // 写法2：
//            ExcelReader excelReader = EasyExcel.read(fileInputStream, Student.class, this.studentListener).build();
//            ReadSheet readSheet = EasyExcel.readSheet(0).build();
//            excelReader.read(readSheet);
//            // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
//            excelReader.finish();

            //----- 写入 -----

            // 写法1
            // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
            // 如果这里想使用03 则 传入excelType参数即可
            //EasyExcel.write(file, Student.class).sheet("模板").doWrite(writeData());

            // 写法2
            // 这里 需要指定写用哪个class去读
//            ExcelWriter excelWriter = EasyExcel.write(file, Student.class).build();
//            WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
//            excelWriter.write(writeData(), writeSheet);
//            // 千万别忘记finish 会附带关闭流
//            excelWriter.finish();

        } catch (Exception ex) {
            log.info("DemoApplication.main.run异常", ex);
        }
    }

    private List<Student> writeData() {
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName(String.format("student%03d", i));
            student.setAge(i + 40);
            student.setScore(new BigDecimal(String.valueOf(i + 90)));
            list.add(student);
        }
        return list;
    }
}
