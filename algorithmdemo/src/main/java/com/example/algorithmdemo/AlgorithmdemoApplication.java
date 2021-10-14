package com.example.algorithmdemo;

import com.example.algorithmdemo.service.mySort.Sortable;
import com.example.algorithmdemo.service.mySort.impl.MergeSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmdemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动......");

        Integer[] arr = {6, 3, 7, 9, 0, 1, 2, 4, 8};
        Sortable mySort = null;

//        mySort = new BubbleSort();
//        mySort.display("冒泡排序处理前数组", arr);
//        mySort.sort(arr);
//        mySort.display("冒泡排序处理后数组", arr);

//        mySort = new SelectSort();
//        mySort.display("选择排序处理前数组", arr);
//        mySort.sort(arr);
//        mySort.display("选择排序处理后数组", arr);

//        mySort = new InsertSort();
//        mySort.display("插入排序处理前数组", arr);
//        mySort.sort(arr);
//        mySort.display("插入排序处理后数组", arr);

//        mySort = new ShellSort();
//        mySort.display("希尔排序处理前数组", arr);
//        mySort.sort(arr);
//        mySort.display("希尔排序处理后数组", arr);

        mySort = new MergeSort();
        mySort.display("归并排序处理前数组", arr);
        mySort.mergerSort(arr, 0, arr.length - 1);
        mySort.display("归并排序处理后数组", arr);

//        mySort = new QuickSort();
//        mySort.display("快速排序处理前数组", arr);
//        mySort.quickSort(arr, 0, arr.length - 1);
//        mySort.display("快速排序处理后数组", arr);

//        mySort = new HeapSort();
//        mySort.display("堆排序处理前数组", arr);
//        mySort.sort(arr);
//        mySort.display("堆排序处理后数组", arr);
    }
}
