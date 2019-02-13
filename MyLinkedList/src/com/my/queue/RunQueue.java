package com.my.queue;

public class RunQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue queue = new MyQueue();
		queue.putToQueue(8);
		queue.putToQueue(9);
		queue.putToQueue(7);
		
		queue.display();
		
		System.out.println("The first one on the queue is :	" + queue.getFromQueue());
		
		queue.display();
		
		queue.putToQueue(12);
		
		queue.display();
		
		System.out.println("The first now on queue is : " + queue.getFromQueue());

	}

}
