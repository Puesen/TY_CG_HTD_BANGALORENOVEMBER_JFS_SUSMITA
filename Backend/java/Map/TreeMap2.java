package com.capgimini.map.treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
public static void main(String[] args) {
	ShortingAge sa=new ShortingAge();
TreeMap< Student,String> t1=new TreeMap<Student,String>(sa);
	
	t1.put( new Student(15,"Ramesh"),"10th Standared");
	t1.put( new Student(18,"Suresh"),"12th Standared");
	t1.put( new Student(12,"Ganesh"),"7th Standared");
	
	Set<Map.Entry<Student,String>> s1=t1.entrySet();
	
	for(Map.Entry<Student,String> e1:s1) {
	System.out.println(e1.getKey());
	System.out.println(e1.getValue());
	System.out.println("-----------------");
	
		
	}
System.out.println(t1.get(new Student(13,"Suresh")));
}
}
