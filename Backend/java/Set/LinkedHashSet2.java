import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
public static void main(String[] args) {
	LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
	
	l1.add(new Employee(22,"Ramu"));
	l1.add(new Employee(26,"Guldu"));
	l1.add(new Employee(23,"Guldi"));
	
	Iterator <Employee> itr=l1.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
