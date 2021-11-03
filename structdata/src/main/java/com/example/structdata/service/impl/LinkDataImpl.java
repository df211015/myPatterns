package com.example.structdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.structdata.dto.ItemDto;
import com.example.structdata.service.IlinkData;
import org.springframework.stereotype.Service;

@Service
public class LinkDataImpl implements IlinkData {
    private ItemDto head;

    public LinkDataImpl() {
        head = new ItemDto();
    }

    @Override
    public void add(ItemDto itemDto) {
        ItemDto currentDto = this.head;
        ItemDto next = this.head.getNext();
        while (null != next) {
            currentDto = next;
            next = next.getNext();
        }
        currentDto.setNext(itemDto);
    }

    @Override
    public void deteted(ItemDto itemDto) {
        ItemDto currentDto = this.head;
        ItemDto next = this.head.getNext();
        while (null != next) {
            currentDto = next;
            next = next.getNext();
            if (null != next && next.getId().equals(itemDto.getId())) {
                currentDto.setNext(next.getNext());
            }
        }
    }

    @Override
    public void show() {
        ItemDto currentDto = this.head;
        ItemDto next = this.head.getNext();
        while (null != next) {
            System.out.println(String.format("打印:%s", JSON.toJSONString(next)));
            next = next.getNext();
        }
    }
}
