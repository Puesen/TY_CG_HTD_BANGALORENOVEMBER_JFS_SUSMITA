import java.util.Vector;

public class Vector2 {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.add(23);
	v1.add(55);
	v1.add(88);
	v1.add(100);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("Using trimToSize ");
	v1.trimToSize();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("Set size = 8");
	v1.setSize(7);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println(v1);
	v1.add(500);
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	
}
}
