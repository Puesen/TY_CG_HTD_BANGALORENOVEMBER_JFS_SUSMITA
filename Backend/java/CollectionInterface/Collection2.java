import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add("12");	c1.add("15");
	Collection c2=new ArrayList();
	c2.add("25");	c2.add("28");
	System.out.println(c1);
	c1.addAll(c2);
	System.out.println(c1);
	Collection c3=new ArrayList();
	c3.add("9");	c3.add("7");
	Collection c4=new ArrayList();
	c4.add("1");	c4.add("5");c4.add("15");
	System.out.println(c3);
	c3.addAll(c4);
	System.out.println(c3);
	
	System.out.println("---------------");
	c2.removeAll(c2);
	System.out.println(c2);
	c1.retainAll(c3);
	System.out.println(c1);
		System.out.println(c1.containsAll(c3));
		c1.clear();
		System.out.println(c1);
		
		
		
		Object a[]=c3.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
}
}
