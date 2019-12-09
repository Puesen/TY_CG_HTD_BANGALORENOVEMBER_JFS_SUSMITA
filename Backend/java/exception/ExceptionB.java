package checkedException;

public class ExceptionB {
public static void main(String[] args) {
	System.out.println("Main Started");
	Student s1=new Student();
	
	try {
		try {
			Object o1=s1.clone();
			System.out.println("Object is Clones");
			Class c1=Class.forName("checkedException.Student");
			
			System.out.println("You are genious your peogram in not throwing an exception");
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone not supported");
		}
		
	} catch (ClassNotFoundException e) {
		System.out.println("Class not found");
	}
	System.out.println("Main Ended");
}
}
