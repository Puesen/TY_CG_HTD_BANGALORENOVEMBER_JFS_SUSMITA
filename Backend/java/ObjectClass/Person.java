
public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	
	@Override
	protected void finalize() throws Throwable {

		super.finalize();
	}
	public static void main(String[] args) throws Throwable {
		Person p1 =new Person("John");
		p1.finalize();
		System.out.println(p1.name);
		
	}
}
