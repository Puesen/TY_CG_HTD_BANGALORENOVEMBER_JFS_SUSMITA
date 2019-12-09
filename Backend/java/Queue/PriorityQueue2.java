package com.capgimini.arrayDequeue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
public static void main(String[] args) {
	
	PriorityQueue<Student> p1= new PriorityQueue<Student>();
	
	p1.offer(new Student(22,"Divya"));
	p1.offer(new Student(25,"Shree"));
	p1.offer(new Student(28,"Divya"));
	
	for (Object object : p1) {
		System.out.println(object);
	}
}
}
