package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

/**
 * 快速排序,体现分治法的思想
 * 算法描述：
 * 1、先从数列中取出一个数作为基准数。
 * 2、分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * 3、再对左右区间重复第二步，直到各区间只有一个数。
 * =================================================
 * 快速排序和归并的区别就在于它正好和递归的排序反过来。
 * 快速排序先排序再递归细分，排序是从上到下的。
 * 归并排序先递归细分再排序，排序是从下到上的。
 * =================================================
 * 非稳定排序
 */
public class QuickSort extends Sortable {
    @Override
    public void sort(Integer[] arr) {

    }

    @Override
    public void quickSort(Integer[] arr, int left, int right) {
        if (left < right) {
            int mid = this.partion(arr, left, right);
            this.quickSort(arr, left, mid - 1);
            this.quickSort(arr, mid + 1, right);
        }
    }

    private int partion(Integer[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while (true) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] >= pivot) {
                j--;
            }
            if (i >= j) {
                break;
            }
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        //将基准元素放置到下标j处
        arr[j] = pivot;
        return j;
    }
}
