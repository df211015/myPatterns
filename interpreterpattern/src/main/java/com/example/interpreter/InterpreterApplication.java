package com.example.interpreter;

import com.example.interpreter.service.CalculatorPlus;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

@SpringBootApplication
public class InterpreterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InterpreterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功!");
        String expStr = getExpStr();
        //赋值
        HashMap<String, Integer> mapVar = getValue(expStr);

//        Calculator cal = new Calculator(expStr);
        //加强版,支持括号
        CalculatorPlus cal = new CalculatorPlus(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(mapVar));
    }

    /**
     * 获得表达式
     *
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        String str = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        return str;
    }

    /**
     * 获得值映射
     *
     * @param exprStr
     * @return
     * @throws IOException
     */
    public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //解析有几个参数要传递
        for (char ch : exprStr.toCharArray()) {
            if(StringUtils.isNotBlank(String.valueOf(ch))) {
                if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '(' && ch != ')') {
                    //解决重复参数的问题
                    if (!map.containsKey(String.valueOf(ch))) {
                        System.out.print("请输入" + ch + "的值:");
                        String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                        map.put(String.valueOf(ch), Integer.valueOf(in));
                    }
                }
            }
        }

        return map;
    }
}