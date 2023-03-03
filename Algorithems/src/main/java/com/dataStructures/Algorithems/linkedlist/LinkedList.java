package com.dataStructures.Algorithems.linkedlist;

public class LinkedList {
    public LinkedList() {
        length = 0;
    }

    ListNode head;
    private int length = 0;

    public synchronized ListNode getHead() {
        return head;
    }

    public synchronized void insertAtBegin(ListNode node) {
        node.setNode(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
      if(head==null){
          head=node;
      }else {
          ListNode p,q;
          for (p=head;(q=p.getNode())!=null;p=q);
          p.setNode(node);
      }
      length++;
    }
    public  void insert(int data, int position){
        if(position<0){
            position=0;
        }
        if(position<length){
            position=length;
        }
        if(head==null){
            head=new ListNode(data);
        }else if(position==0) {
            ListNode temp = new ListNode(data);
            temp.node = head;
            head = temp;
        }
            else{
                ListNode temp=head;
                for(int i=1;i<position;i+=1){
                    temp=temp.getNode();
            }
                ListNode newNode=new ListNode(data);
                newNode.node=temp.node;
                temp.setNode(newNode);
        }
    }





















}