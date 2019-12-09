package com.capgimini.arrayDequeue;
import java.util.Iterator;
import java.util.ArrayDeque;


public class ArrayDequeue1 {
	public static void main(String[] args) {
        ArrayDeque a1 =new ArrayDeque();
        a1.add(23);
        a1.add(85);
        a1.add(44);
        a1.add(17);
        System.out.println(a1);
        a1.addFirst(32);
        a1.addLast(101);
        System.out.println(a1);
        a1.removeFirst();
        a1.removeLast();
        System.out.println(a1);
        Iterator itr= a1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	
        }
	}



}
