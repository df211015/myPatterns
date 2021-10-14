package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

/**
 * 冒泡排序
 * 1、每趟相邻元素进行交换,按要求调整相邻的顺序
 * 2、可以进行下优化，如果一趟下来没有发生任务的交换，则说明数组元素已经是有序，后面不需要再进行处理了
 */
public class BubbleSort extends Sortable {

    /**
     * @param arr 待排序数组
     *            是一种稳定的排序
     */
    @Override
    public void sort(Integer[] arr) {
        Boolean exchangeFlag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            exchangeFlag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    exchangeFlag = true;
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!exchangeFlag) {
                //如果没有发生交换则直接退出
                break;
            }
        }
    }
}
