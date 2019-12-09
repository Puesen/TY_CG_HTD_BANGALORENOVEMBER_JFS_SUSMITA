package exceptionpropogation;

public class A1 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			B1.m();
		}catch(ClassNotFoundException e){
			System.out.println("Class Not Found Handeled in A1 Class");
		}
	System.out.println("Main Ended");	
		
	}

}
