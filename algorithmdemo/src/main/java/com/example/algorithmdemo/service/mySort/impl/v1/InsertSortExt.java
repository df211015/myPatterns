package com.example.algorithmdemo.service.mySort.impl.v1;

import com.example.algorithmdemo.service.mySort.Sortable;

public class InsertSortExt extends Sortable {

    @Override
    public void sort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
