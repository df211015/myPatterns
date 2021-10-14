package com.example.structdata.utils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraysUtils {
    public static <T> List<List<T>> divideEqually(List<T> array, Integer total) {

        if (null == array || array.size() == 0) {
            return null;
        }
        if (null == total) {
            return null;
        }
        List<List<T>> result = new CopyOnWriteArrayList<>();
        Integer size = array.size();
        Integer step = size / total;
        Integer frequency = 0;
        for (int i = 0; i < size; i += step) {
            Integer fromIndex = i;
            Integer toIndex = i + step;
            frequency++;
            if (frequency >= total) {
                toIndex = size;
                result.add(array.subList(fromIndex, toIndex));
                return result;
            }
            result.add(array.subList(fromIndex, toIndex));
        }
        return result;
    }
}
