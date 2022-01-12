package com.example.structdata.dto;

import lombok.Data;

@Data
public class BitNode {
    private Integer data;
    private BitNode lchild;
    private BitNode rchild;

    public void setNode(Integer data, BitNode lc, BitNode rc) {
        this.data = data;
        this.lchild = lc;
        this.rchild = rc;
    }
}
