package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

/**
 * 选择排序
 * 首先，找到数组中最小的那个元素的下标，
 * 其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
 * 其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
 * 如此往复，直到将整个数组排序。这种方法我们称之为选择排序
 */
public class SelectSort extends Sortable {
    /**
     * @param arr 待排序的数组
     *            非稳定排序，如序列5 8 5 2 9，我们知道第一遍选择第1个元素5会和2交换，那么原序列中2个5的相对前后顺序就被破坏了
     * @return
     */
    @Override
    public void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            Integer temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}