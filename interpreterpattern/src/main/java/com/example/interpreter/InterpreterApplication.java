package com.example.interpreter;

import com.example.interpreter.service.customize.AndExpression;
import com.example.interpreter.service.customize.Expression;
import com.example.interpreter.service.customize.OrExpression;
import com.example.interpreter.service.customize.TerminalExpression;
import com.example.interpreter.service.customize02.ERejectRetailStandardReason;
import com.example.interpreter.service.customize02.RetailStandardCheckFactory;
import com.example.interpreter.service.customize03.Free;
import com.example.interpreter.service.customize03.Passenger;
import com.example.interpreter.service.simple.Calculator;
import com.example.interpreter.service.v1.CalculatorPlus;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class InterpreterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InterpreterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功!");

        /**
         * String expStr = getExpStr();
         //赋值
         HashMap<String, Integer> mapVar = getValue(expStr);
         //普通版本,支持加减法
         Calculator cal = new Calculator(expStr);

         //加强版,支持括号
         //        CalculatorPlus cal = new CalculatorPlus(expStr);
         System.out.println("运算结果为：" + expStr + "=" + cal.run(mapVar));
         **/

        /**
         * 通过设置不同的规则,应用时解析相应的规则
         */
//        Expression goodStudent = getMGoodStudentExpression();
//        Expression hobby = getHobbyExpression();
//        System.out.println("zhangshan是个三好学生么? " + goodStudent.interpret("zhangshan"));
//        System.out.println("wangwu like music? " + hobby.interpret("wangwu hate music"));
        //List<ERejectRetailStandardReason> retailStandardType = RetailStandardCheckFactory.getRetailStandardType("1000", "D柱变形");

        Free free = new Free(65, 120.0);
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = Passenger.builder().name("aaa").age(70).height(150.0).build();
        Passenger passenger2 = Passenger.builder().name("bbb").age(50).height(150.0).build();
        Passenger passenger3 = Passenger.builder().name("ccc").age(30).height(110.0).build();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.forEach(r -> {
            Boolean result = free.result(r.getAge(), r.getHeight());
            System.out.println(String.format("用户:%s,%s", r.getName(), result ? "免费" : "请刷卡"));
        });

        String str = "";
    }

    //规则1：zhangshan 和 lisi 都是三好学生
    public static Expression getMGoodStudentExpression() {
        Expression zhangshan = new TerminalExpression("zhangshan");
        Expression lisi = new TerminalExpression("lisi");
        return new OrExpression(zhangshan, lisi);
    }

    //规则2：wangwu like music
    public static Expression getHobbyExpression() {
        Expression wangwu = new TerminalExpression("wangwu");
        Expression like = new TerminalExpression("like");
        Expression music = new TerminalExpression("music");
        AndExpression andExpression = new AndExpression(wangwu, like);
        AndExpression andExpressionFinal = new AndExpression(andExpression, music);
        return andExpressionFinal;
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
            if (StringUtils.isNotBlank(String.valueOf(ch))) {
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