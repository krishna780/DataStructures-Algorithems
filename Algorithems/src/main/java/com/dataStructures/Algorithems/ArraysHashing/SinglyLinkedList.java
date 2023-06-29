package com.dataStructures.Algorithems.ArraysHashing;

public class SinglyLinkedList<T>{
        Node<T> head;

        public SinglyLinkedList() {
            this.head = null;
        }

        public void insertAtEnd(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                if (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void insertAtBegin(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
        public void display(){
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    }

