package com.capgimini.arrayDequeue;


public class Student implements Comparable<Student> {
	
	int studAge;
	String studName;
	public Student(int studAge, String studName) {
		super();
		this.studAge = studAge;
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studAge=" + studAge + ", name=" + studName + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.studAge>o.studAge) {
			return 1;
	}else if(this.studAge<o.studAge) {
		return -1;
	}else {
	return studAge;
	}

}
}