package com.dataStructures.Algorithems;



import java.util.Comparator;

public class BinarySearchTreeEx  {


    Node root;
    public void insert(Node node){

        root=insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root==null){
            root= node;
            return node;
        } else if (data< root.data) {
            root.left=insertHelper(root.left, node);

        }else {
            root.right=insertHelper(root.right, node);

        }
        return root;
    }

    public void display() {
       if(root!=null){
           displayHelper(root);
       }
    }

    private void displayHelper(Node root) {
          if(root!=null){
           displayHelper(root.left);
              System.out.println(root.data);
              displayHelper(root.right);
          }
    }


    private class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
}
