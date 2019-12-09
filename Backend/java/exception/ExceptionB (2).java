package nestedtry;

public class ExceptionB {

	void exception(int a, String b) {
		try {
			System.out.println(10/0);
		
		try {
			System.out.println(500/a);
		}
		catch(ArithmeticException a1) {
			System.out.println("Don't deal with 0");
		}
	}catch(NullPointerException e) {
	System.out.println("Don't deal with null");	
	}
	}
}
