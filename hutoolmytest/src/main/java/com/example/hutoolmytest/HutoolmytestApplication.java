package com.example.hutoolmytest;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.lang.Console;
import cn.hutool.core.text.StrBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HutoolmytestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HutoolmytestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hutool启动成功!");

//        Animal proxy = ProxyUtil.proxy(new Cat(), MySimpleAspect.class);
//
//        proxy.eat("small cat");

        // 测试图片的叠加
//        com.example.hutoolmytest.comm.ImgUtil.overlyingImageTest();
        // 测试图片的垂直合并
//        com.example.hutoolmytest.comm.ImgUtil.imageMargeTest();

//        String[] col= new String[]{"a","b","c","d","e"};
//        List<String> colList = CollUtil.newArrayList(col);
//
//        String str = CollUtil.join(colList, "#");
//
//        System.out.println(str);

//        //Integer比较器
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        //新建三个列表，CollUtil.newArrayList方法表示新建ArrayList并填充元素
//        List<Integer> list1 = CollUtil.newArrayList(1, 2, 3);
//        List<Integer> list2 = CollUtil.newArrayList(4, 5, 6);
//        List<Integer> list3 = CollUtil.newArrayList(0, 10, 7, 8, 9);
//
//        //参数表示把list1,list2,list3合并并按照从小到大排序后，取0~2个（包括第0个，不包括第2个），结果是[1,2]
//        @SuppressWarnings("unchecked")
//        List<Integer> result = CollUtil.sortPageAll(0, 11, comparator, list1, list2, list3);
//        System.out.println(result);     //输出 [1,2]

//        try {
//            List<Student> list = new ArrayList<>();
//            list.add(new Student(1, 1, 1, "张三"));
//            list.add(new Student(1, 1, 2, "李四"));
//            list.add(new Student(1, 1, 3, "王五"));
////            list.add(new Student(1, 1, 4, null));
//
//            Map<Long, String> map = map = CollStreamUtil.toMap(list, Student::getStudentId, Student::getName);
//
//            map.get(1L);
//        } catch (Exception ex) {
//            String msgErr = ex.toString();
//            System.out.println(String.format("异常:%s", msgErr));
//        }

        //StringBuilder
        TimeInterval timer = DateUtil.timer();
        StringBuilder b2 = new StringBuilder();
        for(int i =0; i< 3000000; i++) {
            b2.append("test");
            b2 = new StringBuilder();
        }
        Console.log("StringBuilder:" + timer.interval());

        //StrBuilder
        TimeInterval timer2 = DateUtil.timer();
        StrBuilder builder = StrBuilder.create();
        for(int i =0; i< 3000000; i++) {
            builder.append("test");
            builder.reset();
        }
        Console.log("StrBuilder:" + timer2.interval());
    }
}
