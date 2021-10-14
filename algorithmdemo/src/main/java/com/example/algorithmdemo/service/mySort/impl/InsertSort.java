package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

/**
 * 插入排序
 * 算法描述：
 * 1、插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而形成一个新的、记录数增1的有序表
 * 2、插入排序的工作方式像许多人排序一手扑克牌。开始时，我们的左手为空并且桌子上的牌面向下。然后，我们每次从桌子上拿走一张牌并将它插入左手中正确的位置
 *
 */
public class InsertSort extends Sortable {
    /**
     *
     * @param arr 待排序的数组
     * 是一种稳定的排序算法
     * 每次基于加进来的项进行排序
     */
    @Override
    public void sort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Integer temp = arr[i];
            int j = 0;
            //依次进行排序处理
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    //往后移动元素，留出前面的空位
                    arr[j + 1] = arr[j];
                } else {
                    //已有数据已排好序,一旦没有移动则直接退出本轮比较
                    break;
                }
            }
            //将本轮项插入到前面合适位置，注意这里有可能是排到小队列的中间位置
            arr[j + 1] = temp;
        }
    }
}
