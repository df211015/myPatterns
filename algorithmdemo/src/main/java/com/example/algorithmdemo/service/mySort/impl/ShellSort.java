package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

/**
 * 希尔排序
 *
 */
public class ShellSort extends Sortable {
    /**
     * @param arr
     * 非稳定排序
     * 对插入排序的一种改进,先按跳跃式插入排序,最后退化为插入排序
     */
    @Override
    public void sort(Integer[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                this.innerSort(arr, gap, i);
            }
        }
    }

    private void innerSort(Integer[] arr, Integer gap, Integer i) {
        Integer inserted = arr[i];
        int j = 0;
        //按间隔gap取数的方式进行排序处理
        for (j = i - gap; j >= 0; j -= gap) {
            if (arr[j] > inserted) {
                arr[j + gap] = arr[j];
            } else {
                break;
            }
        }
        //插入
        arr[j + gap] = inserted;
    }
}
