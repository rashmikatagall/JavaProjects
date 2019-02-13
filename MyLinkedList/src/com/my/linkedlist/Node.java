package com.my.linkedlist;

public class Node {
	private int element;
	private Node nextNode;
	
	public Node()
	{
		element = 0;
		nextNode = null;
	}

    public Node(int element, Node nextNode)
    {
    	
     this.element = element;
     this.nextNode = nextNode;
    }
    
public void setNextNode(Node node)
{
	this.nextNode=node;
}

public Node getNextNode()
{
	return this.nextNode;
}

public int getElement()
{
	return this.element;
}
}