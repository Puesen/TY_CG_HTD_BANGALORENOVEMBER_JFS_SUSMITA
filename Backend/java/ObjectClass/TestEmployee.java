
public class TestEmployee {
public static void main(String[] args) {
	Empliyee e1=new Empliyee(22,"Divya");
	System.out.println(e1.hashCode());
	Empliyee e2=new Empliyee(23,"Shree");
	System.out.println(e2.hashCode());
	
	System.out.println(e2);
	Object o1=new Object();
}
}
