package com.rashmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree(int val)
	{
		this.root = new Node(val);
	}
	
	public BinarySearchTree() {}
	
	public Node add(int val) {
		root = addtoTree(root,val);
		return root;
	}
	
	private Node addtoTree(Node node, int val) {
		
		if (node == null)
			return new Node(val);
		
		if(val < node.val)
			node.left = addtoTree(node.left,val);
		else
			node.right= addtoTree(node.right,val);
		
		return node;
		
	}

	public List<Integer> inOrdertraverse() {
		List<Integer> list = new ArrayList<>();
		addInOrder(list,root);
		return list;
	}
	
	private void addInOrder(List<Integer> list, Node node) {
	
		if(node == null)
			return;
		
		addInOrder(list,node.left);
		list.add(node.val);
		addInOrder(list,node.right);
		
	}

	public void printPreOrder() {
		
	}
	
	public void printPostOrder() {
		
	}
	
	public boolean search(int val) {
		return true;
	}
	
	public void delete(int val) {
		
	}
	
}
