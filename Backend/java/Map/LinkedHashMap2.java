package com.capgimini.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2 {
public static void main(String[] args) {
	LinkedHashMap<Integer, Employee> l1=new LinkedHashMap<Integer,Employee>();
	
	l1.put(34, new Employee(25600,"Ramesh"));
	l1.put(37, new Employee(56000,"Suresh"));
	l1.put(47, new Employee(6100,"Ganesh"));
	
	System.out.println(l1.get(47));
	Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
	
	for(Map.Entry<Integer, Employee> e1:s1) {
	System.out.println(e1.getClass());
	System.out.println(e1.getValue());
	System.out.println("-----------------");
	
		
	}
System.out.println(l1.containsKey(47));
System.out.println(l1.containsValue("BTR"));
}
}
