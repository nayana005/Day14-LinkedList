package com.bridgelabz;

public class LinkedListMain {
	
	public static void main(String[] argS) {
		
		System.out.println("Welcome To Linked List Program");
		
		OrderedLinkedList<Integer> ascendingList = new OrderedLinkedList<>();
        ascendingList.adds(56);
        ascendingList.adds(30);
        ascendingList.adds(40);
        ascendingList.adds(70);
        ascendingList.display();
        ascendingList.sortNode();
        ascendingList.display();


    }
}