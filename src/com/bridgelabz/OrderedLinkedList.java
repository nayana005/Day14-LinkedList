package com.bridgelabz;

public class OrderedLinkedList<E> {
    Node<E> node;
    Node<E> tail;
    Node<E> head;
    public void adds (int data) {
        Node<E> newnode = new Node<>(data);
        if (head == null) {
            this.node = newnode;
            this.head = newnode;
            this.tail = newnode;
        } else {
            tail.next = newnode;
            tail=newnode;
        }
    }
    public void sortNode(){

        Node<E> current = head, index = null;
        int temp;

        if (head == null){
            return;
        }
        else{
            while (current != null){
                index = current.next;
                while (index != null){
                    if(current.data > index.data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }

    }


    public void display() {
        Node<E> current = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {

            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}