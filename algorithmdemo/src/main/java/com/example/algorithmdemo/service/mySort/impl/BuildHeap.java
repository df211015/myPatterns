package com.example.algorithmdemo.service.mySort.impl;

/**
 * 创建大顶堆
 */
public class BuildHeap {
    /**
     * 由数组向树转化,构建最大堆
     *
     * @param arr
     * @param heapSize
     * @param index
     */
    public void max_heapify(Integer[] arr, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        //最大数下标
        int max = index;
        if (left < heapSize && (arr[left] > arr[max])) {
            max = left;
        }

        if (right < heapSize && (arr[right] > arr[max])) {
            max = right;
        }

        System.out.println(String.format("left:%s,right:%s,largest:%s,index:%s", left, right, max, index));

        if (max != index) {
            // 父节点小于左右孩子结点,需要交换
            this.exchangeElements(arr, index, max);

            // 发生过交换后,原来父结点现在所在位置的值不一定还满足大顶堆的定义，需要递归继续建堆
            this.max_heapify(arr, heapSize, max);
        }
    }

    /**
     * 交换数组元素
     *
     * @param array  数组
     * @param index1 元素1
     * @param index2 元素2
     */
    public void exchangeElements(Integer[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
