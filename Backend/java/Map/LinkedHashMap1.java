package com.capgimini.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("BTM", 580056);
	l1.put("Rajajinagar", 564008);
	l1.put("BTR", 678004);
	l1.put("OAR", null);
	l1.put(null, null);
	l1.put(null, null);//only one null key value
	
	Set<Map.Entry<String,Integer>> s1=l1.entrySet();
	
	for (Map.Entry<String, Integer> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("---------------------");
		
		System.out.println(l1.containsKey("btm"));
		System.out.println(l1.containsValue(580056));
		System.out.println(l1.values());
		System.out.println(l1.get("BTR"));
		System.out.println(l1.keySet());
	}
}
}
