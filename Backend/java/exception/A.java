package exceptionpropogation;

public class A {
	static void o() {
		
		try {
			B.n();
		}
		catch(ArithmeticException e){
			System.out.println("A Class: " +e.getMessage());
			
		}
	}

}
