package com.my.linkedlist;

public class RunLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList mylist = new MyLinkedList();
		
		System.out.println("The linked list is empty : " + mylist.isEmpty());
		mylist.insertAtStart(5);
		mylist.insertAtStart(4);
		mylist.insertAtEnd(3);
		
		mylist.display();
		
		mylist.insertAtPosition(6, 3);
		
		mylist.display();
		System.out.println("The element at position 5 is : " + mylist.elementAt(5));
		mylist.insertAtEnd(8);
		
		mylist.display();
		
		System.out.println("The element at position 5 is : " + mylist.elementAt(5));
		mylist.insertAtStart(10);
		
		mylist.display();
		System.out.println("The element 6 is at position : " + mylist.indexOf(6));
		mylist.insertAtPosition(7, 5);
		
		mylist.display();
		System.out.println("The linked list is empty : " + mylist.isEmpty());
		mylist.deleteAtposition(4);
		mylist.display();
		mylist.deleteAtEnd();
		mylist.display();
		
		System.out.println("The element at position 5 is : " + mylist.elementAt(5));
		mylist.deleteAtStart();
		mylist.display();
	
	}

}
