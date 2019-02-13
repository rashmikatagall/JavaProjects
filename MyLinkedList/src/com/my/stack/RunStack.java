package com.my.stack;

public class RunStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push(5);
		stack.push(7);
		System.out.println("The top of stack is " + stack.pop());
		stack.display();
		
		stack.push(13);
		stack.push(9);
		
		System.out.println("The top of stack is "+ stack.pop());		
	    stack.display();

	}

}
