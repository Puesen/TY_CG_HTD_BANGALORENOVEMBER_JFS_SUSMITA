package checkedException;

public class ExceptionA {
public static void main(String[] args) {
	System.out.println("Main Started");
	try {
		Class c1= Class.forName("checkedException.Person");
		System.out.println("Class Found");
	} catch (ClassNotFoundException e) {
	System.out.println("Class not found");
	}
System.out.println("Main Ended");
}
}
