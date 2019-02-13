package com.my.linkedlist;

public class MyLinkedList {
	
	Node start;
	Node end;
	int size;
	 
	public MyLinkedList()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int ele)
	{
		System.out.println("\nInserting at start, element : "+ ele);
		Node newnode = new Node(ele,null);
		size++;
		if (start == null)
		{
			start = newnode;
			end = start;
		}else
		{
			newnode.setNextNode(start);
			start = newnode;
		}
	}
	
	
	public void insertAtEnd(int ele)
	{
		System.out.println("\nInserting at end,element : "+ ele);
		Node newnode = new Node(ele,null);
		size++;
		if (start == null)
		{
			start=newnode;
			end=start;
		}else
		{
			end.setNextNode(newnode);
			end = newnode;
		}
		
	}
	
	public void insertAtPosition(int ele, int position)
	{
		System.out.println("\nInserting at position : " + position + " element : " + ele);
		Node newnode = new Node(ele,null);
		Node dummy = start;
		int i = 1;
		
		while (i < position-1)
		{
			dummy = dummy.getNextNode();
			i++;
		}
		
		newnode.setNextNode(dummy.getNextNode());
		dummy.setNextNode(newnode);
		size++;		
	}
	
	
	public void deleteAtStart()
	{
		System.out.println("\nDeleting at start");
		Node dummy = start;
		start = dummy.getNextNode();
		size--;
	}
	
	public void deleteAtEnd()
	{
		System.out.println("\nDeleting at end");
		Node dummy = start;
		int i =1;
		while(i++ < size-1)
		{
			dummy = dummy.getNextNode();
		}
		end = dummy;
		size--;		
	}
	
	public void deleteAtposition(int posi)
	{
		System.out.println("\nDeleting at posi" + posi);
		Node dummy = start;
		Node prevdummy = new Node();
		int i = 1;
	
		while( i++ < posi)
		{
			prevdummy = dummy;
			dummy = dummy.getNextNode();
		}
		prevdummy.setNextNode(dummy.getNextNode());
		size--;
	}
	
	public boolean isEmpty()
	{
		boolean empty = true;
		if(size > 0)
			empty= false;
		return empty;
	}

	public int elementAt(int posi)
	{
		if (posi > size)
			return -1;
		Node dummy = start;
		int i = 1;
		
		while ( i++ < posi)
		{
			dummy = dummy.getNextNode();
		}
		return dummy.getElement();
	}

	public int indexOf(int element)
	{
	  Node dummy = start;
	  int i = 1;
	  while(i++ < size)
	  {
		  if (dummy.getElement() == element)
			  return i;
		  dummy=dummy.getNextNode();
	  }
	  return -1;
	}
	
	public void display()
	{
		int mysize = size ;
		Node dummy = start;
		System.out.println("The size of linked list is :" + size );
		
		
		
		String elements = "";
		while (mysize-- != 0)
		{
			elements = elements +" " + Integer.toString(dummy.getElement());
			//System.out.println(dummy.getElement() + " > ");
			dummy = dummy.getNextNode();
		}
		System.out.println("The elements of the linked list are : "+ elements);
	}
}
