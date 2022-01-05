package com.example.algorithmdemo.service.mySort.impl.v1;

public class Merge {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 8, 4, 5, 6, 7, 10};
        process(arr, 0, 4, 8);

        System.out.println("打印!");
    }

    static void process(Integer[] arr, int left, int mid, int right) {
        Integer[] temp = new Integer[right - left + 1];
        int i = left;
        int j = mid;
        int k = 0;
        while (i < mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int q = 0; q < temp.length; q++) {
            arr[q] = temp[q];
        }
    }
}
