package com.example.algorithmdemo.service.mySort.impl;

import com.example.algorithmdemo.service.mySort.Sortable;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort extends Sortable {

    private BuildHeap buildHeap = new BuildHeap();

    @Override
    public void sort(Integer[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        /**
         * lastParent原理
         * 根据二叉树性质，深度为k的二叉树至多有2的k次方-1个结点(k≥1）
         * 所以如果最末尾节点为右节点，array.length为奇数，那么上一层父节点的编号应该为（array.length-1）/2=array.length/2
         * 所以如果最末尾节点为左节点，array.length为偶数，那么上一层父节点的编号也为array.length/2
         * 由于数组下标从0开始，所以应该要在堆对应的编号基础上-1
         */
        int start = arr.length / 2 - 1;
        for (int i = start; i >= 0; i--) {
            //处理每一个子树
            this.buildHeap.max_heapify(arr, arr.length, i);
        }
        System.out.println("buildMaxHeap " + Arrays.toString(arr));

        for (int i = arr.length - 1; i > 0; i--) {
            this.buildHeap.exchangeElements(arr, 0, i);
            this.buildHeap.max_heapify(arr, i, 0);
        }
    }
}
