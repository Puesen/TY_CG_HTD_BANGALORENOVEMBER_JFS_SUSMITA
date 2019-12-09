package treeset;

import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	TreeSet<Student> t1=new TreeSet<Student>();
	
	t1.add(new Student(21,"Johnny"));
	t1.add(new Student(21,"Johnny"));
	t1.add(new Student(1,"Yes"));;
	t1.add(new Student(50,"Pappa"));
	t1.add(new Student(2,"Suger"));
	
	for(Student s1 :t1) {
		System.out.println(s1);
	}
	
	
	
}
}
