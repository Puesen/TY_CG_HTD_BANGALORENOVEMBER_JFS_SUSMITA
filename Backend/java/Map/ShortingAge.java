package com.capgimini.map.treeMap;

import java.util.Comparator;

public class ShortingAge implements Comparator<Student>{
	  int age;

@Override
		public int compare(Student o1, Student o2) {
			if(o1.age>o2.age) {
				return 1;
			}else if(o1.age<o2.age) {
				return -1;
			}else {
			return age;
			}
		}



	}
