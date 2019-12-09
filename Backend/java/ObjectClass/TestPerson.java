
public class TestPerson {
	String name;
	public TestPerson(String name) {
		super();
		this.name = name;
	}

public static void main(String[] args) throws Throwable {
	System.out.println("-----Main Started-------");
	Person p1=new Person("John");
	System.out.println(p1.name);
	p1.finalize();	
	TestPerson p2=new TestPerson("Jhonny");
	p2.finalize();
	System.out.println(p2.name);
	p1=null;
	System.gc();
	System.out.println("-----Main End------");
	
}
}
