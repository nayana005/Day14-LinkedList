package com.bridgelabz;

public class LinkedListMain {
	
	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(56);
        linkedList1.insert(30);
        System.out.println(linkedList1.pop());
        linkedList1.print();
        System.out.println();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList2.print();
        System.out.println();
        System.out.println(linkedList2.popLast());
        linkedList2.print();
    }
}