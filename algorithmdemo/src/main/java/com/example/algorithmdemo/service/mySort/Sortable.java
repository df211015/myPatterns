package com.example.algorithmdemo.service.mySort;

import com.alibaba.fastjson.JSON;

public abstract class Sortable {
    /**
     * 排序
     *
     * @param arr
     * @return
     */
    public abstract void sort(Integer[] arr);

    /**
     * 排序
     * @param arr
     * @param left
     * @param right
     */
    public void mergerSort(Integer[] arr, int left, int right){

    }

    /**
     * 排序
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort(Integer[] arr, int left, int right){

    }

    /**
     * 打印
     */
    public void display(String title, Integer[] arr) {
        System.out.println(String.format("%s:%s", title, JSON.toJSONString(arr)));
    }
}
