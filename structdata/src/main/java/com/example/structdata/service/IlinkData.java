package com.example.structdata.service;

import com.example.structdata.dto.ItemDto;

/**
 * 链接
 */
public interface IlinkData {
    /**
     * 追加结点
     * @param itemDto
     */
    void add(ItemDto itemDto);

    /**
     * 删除结点
     * @param itemDto
     */
    void deteted(ItemDto itemDto);

    /**
     * 打印节点
     */
    void show();
}
