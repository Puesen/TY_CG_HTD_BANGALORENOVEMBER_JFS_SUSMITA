import java.util.HashSet;

public class HashSet2 {
public static void main(String[] args) {
	HashSet<Student> h1=new HashSet<Student>();
	
	h1.add(new Student("Pampa",20));
	h1.add(new Student("Pue",24));
	h1.add(new Student("Monai",19));
	h1.add(new Student("Bumba",19));
	h1.add(new Student("Pue",24));
	h1.add(new Student("Monai",19));
	
	for(Student s1 : h1) {
		System.out.println(s1.name +" age is" + s1.age);
	}
	
}
}
