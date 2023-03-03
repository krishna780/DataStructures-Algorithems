package com.dataStructures.Algorithems.linkedlist;

import org.apache.commons.lang3.ObjectUtils;

public class ListNode {
    public int data;
    ListNode node;

    public ListNode(int data) {
        this.data=data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNode(ListNode node) {
        this.node = node;
    }

    public int getData() {
        return data;
    }

    public ListNode getNode() {
        return node;
    }
    public int ListNodeLength(ListNode node){
        int length=0;
        ListNode listNode = node;
        while(ObjectUtils.isNotEmpty(listNode)){
            length++;
          listNode=  listNode.getNode();
        }
        return length;
    }

}
