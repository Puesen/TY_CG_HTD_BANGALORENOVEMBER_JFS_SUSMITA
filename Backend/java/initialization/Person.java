package initialization;

public class Person {
	int age;
	String name;
	void personDetails()
	{
		System.out.println("Name is "+name+ " age is "+ age);
		
	}
	
	

	public void initialize(int age, String name) {
		System.out.println("Name is "+name+ " age is "+ age);
		
	}
	
}
