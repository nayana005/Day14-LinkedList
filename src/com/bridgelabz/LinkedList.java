package com.bridgelabz;

public class LinkedList<E> {

	Node<E> head;
	Node<E> tail;

	public void push(E key) {
		Node<E> newNode = new Node<>(key);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else{
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void add(E key) {
		Node<E> newNode = new Node<>(key);
		if (head == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
	}
	
	public void append(E key) {
		Node<E> newNode = new Node<>(key);
		if(head == null)
		   head = newNode;
		if(tail == null)
		   tail = newNode;
		else {
		   tail.setNext(newNode);
		   tail = newNode;
		}
	}

	void print(){
		Node<E> temp = head;
		while(temp!=null){
			System.out.print(temp.getKey() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
