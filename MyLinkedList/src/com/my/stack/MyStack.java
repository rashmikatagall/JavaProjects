package com.my.stack;
import com.my.linkedlist.*;

public class MyStack {

	MyLinkedList myStack;
	
	public MyStack()
	{
		myStack = new MyLinkedList();
	}
	
	
	public void push(int element)
	{
		myStack.insertAtStart(element);
	}
	
	public int pop()
	{
		int element = myStack.elementAt(1);
		myStack.deleteAtStart();
		return element;
	}
	
	public void display()
	{
		myStack.display();
	}
}
