package com.example.structdata.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 内存分页处理类
 *
 * @param <T>
 */
public class RamPagerHelper<T> {
    private List<T> data;
    private Integer pageSize;

    /**
     * @param data     原始数据
     * @param pageSize 每页条数
     */
    public RamPagerHelper(List<T> data, Integer pageSize) {
        this.data = data;
        this.pageSize = pageSize;
    }

    /**
     * 获取某页数据，从第1页开始
     *
     * @param pageIndex 第几页
     * @return 分页数据
     */
    public List<T> page(Integer pageIndex) {
        if (pageIndex < 1) {
            pageIndex = 1;
        }
        Integer from = (pageIndex - 1) * this.pageSize;
        Integer to = Math.min(pageIndex * this.pageSize, this.data.size());
        if (from > to) {
            from = to;
        }
        return this.data.subList(from, to);
    }

    /**
     * 获取总页数
     */
    public Integer getPageCount() {
        if (this.pageSize.equals(0)) {
            return 0;
        }
        return this.data.size() % this.pageSize == 0 ? (this.data.size() / this.pageSize) : (this.data.size() / this.pageSize + 1);
    }

    /**
     * 元素迭代器
     */
    public Iterator<List<T>> iterator() {
        return new IteratorCustomize();
    }

    private class IteratorCustomize implements Iterator<List<T>> {
        Integer pageIndex = 1;

        IteratorCustomize() {
        }

        public boolean hasNext() {
            return this.pageIndex <= RamPagerHelper.this.getPageCount();
        }

        /**
         * @return 返回page页的页码数据
         */
        public List<T> next() {
            Integer i = this.pageIndex;
            if (i > RamPagerHelper.this.getPageCount()) {
                return new ArrayList<>();
            }
            this.pageIndex = i + 1;
            return RamPagerHelper.this.page(i);
        }
    }
}
