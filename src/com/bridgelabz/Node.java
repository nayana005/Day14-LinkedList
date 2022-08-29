package com.bridgelabz;

public class Node<K> {
    int data;
    Node<K> next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}