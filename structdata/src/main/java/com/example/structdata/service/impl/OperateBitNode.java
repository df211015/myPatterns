package com.example.structdata.service.impl;

import com.example.structdata.dto.BitNode;

public class OperateBitNode {

    //定义一个静态计数变量
    private static Integer counter = 0;

    /**
     * 构造二叉树
     *
     * @param root 根节点
     * @param a    数据源
     * @param i    计数器
     * @return 根节点
     */
    public BitNode createBiTree(BitNode root, Integer[] a, Integer i) {
        if (i < a.length) {
            if (a[i] == 0) {
                root = null;
            } else {
                BitNode lchild = new BitNode();
                BitNode rchild = new BitNode();

                root.setData(a[i]);
                BitNode lBiTree = this.createBiTree(lchild, a, ++counter);
                root.setLchild(lBiTree);
                BitNode rBiTree = this.createBiTree(rchild, a, ++counter);
                root.setRchild(rBiTree);
            }
        }

        return root;
    }
}
