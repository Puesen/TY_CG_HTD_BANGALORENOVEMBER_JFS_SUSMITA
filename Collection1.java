import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	//adding an element inside the collection
	c1.add(12);
	System.out.println(c1);
	//adding an element inside the collection
	c1.remove(12);
	System.out.println(c1);
	//finding the size of the collection
	System.out.println(c1.size());
	//checking collection is empty or not
	System.out.println(c1.isEmpty());
	c1.add(15);
	//checking 15 object is present or not in collection
	System.out.println(c1.contains(15));
	c1.add("pue");
	System.out.println(c1);
	
}
}
