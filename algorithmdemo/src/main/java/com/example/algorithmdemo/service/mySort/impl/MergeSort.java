package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

import java.util.Arrays;

/**
 * 归并排序
 * 算法描述：
 * 1、归并排序是建立在归并操作上的一种有效，稳定的排序算法，
 * 该算法是采用分治法的一个非常典型的应用。将已有序的子序列合并，
 * 得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序
 * <p>
 * =================================================
 * 快速排序和归并的区别就在于它正好和递归的排序反过来。
 * 快速排序先排序再递归细分，排序是从上到下的。
 * 归并排序先递归细分再排序，排序是从下到上的。
 * =================================================
 * 是一种稳定的排序算法
 */
public class MergeSort extends Sortable {
    /***
     *
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private void merge(Integer[] arr, int left, int mid, int right) {
        //创建临时数组tmp,及其指针k
        int[] tmp = new int[right - left + 1];
        int k = 0;
        //左右指针
        int i = left;
        int j = mid + 1;
        //先把小数移动到临时数组
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        //左边剩余的数移动到数组
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        //右边剩余的数移动到数组
        while (j <= right) {
            tmp[k++] = arr[j++];
        }
        //新数组 覆盖原数组
        for (int m = 0; m < tmp.length; m++) {
            arr[m + left] = tmp[m];
        }
    }

    /**
     * 递归处理
     *
     * @param arr
     * @param left
     * @param right
     */
    @Override
    public void mergerSort(Integer[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            //左边
            this.mergerSort(arr, left, mid);
            //右边
            this.mergerSort(arr, mid + 1, right);
            //左右归并
            this.merge(arr, left, mid, right);

            System.out.println(Arrays.toString(arr));
        }
    }

    @Override
    public void sort(Integer[] arr) {
        //空实现
    }
}
