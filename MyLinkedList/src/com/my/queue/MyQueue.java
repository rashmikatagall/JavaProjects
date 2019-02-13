package com.my.queue;

import com.my.linkedlist.*;
public class MyQueue {
	
	MyLinkedList MyQueue;
	
	public MyQueue()
	{
		MyQueue= new MyLinkedList();
	}

	
	public void putToQueue(int element)
	{
		MyQueue.insertAtEnd(element);
	}
	
	public int getFromQueue()
	{
		int element = MyQueue.elementAt(1);
		MyQueue.deleteAtStart();
		return element;	
	}
	
	public void display()
	{
		MyQueue.display();
	}
}
