package com.tyss.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	Queue p1=new PriorityQueue();
	
	p1.offer(78);
	p1.offer(47);
	p1.offer(12);
	p1.offer(5);
	p1.offer(11);
	System.out.println(p1);
	p1.poll();
	p1.poll();
	System.out.println(p1);

	System.out.println("Priority Queue element(): " +p1.element());

	System.out.println("Priority Queue peek():" +p1.peek());
	
	for(Object o1:p1) {
		System.out.println(o1);
	}
}
}
