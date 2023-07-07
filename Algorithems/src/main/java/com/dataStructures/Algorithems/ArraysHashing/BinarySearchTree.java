package com.dataStructures.Algorithems.ArraysHashing;

public class BinarySearchTree {

    NodeEx root;
    public void addNode(int key, String name){
        NodeEx nodeEx=new NodeEx(key,name);

        if(root==null){
            root=nodeEx;
        }else {
             NodeEx focusNode=root;
             NodeEx parent;
            while (true) {
              parent=focusNode;
              if(key< focusNode.key){
                 focusNode=focusNode.left;
                 if(focusNode==null){
                     parent.left=nodeEx;
                     return;
                 }
              }else {
                  focusNode=focusNode.right;
                  if(focusNode==null){
                      parent.right=nodeEx;
                      return;
                  }
              }

            }
        }
    }
    public static void main(String[] args) {

    }
}
class NodeEx{
    int key;
    String name;
    NodeEx left;
    NodeEx right;

    public NodeEx(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NodeEx{" +
                "key=" + key +
                ", name='" + name + '\'' +
                '}';
    }
}