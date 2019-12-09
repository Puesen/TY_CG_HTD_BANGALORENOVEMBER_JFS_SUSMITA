import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(12);
		l1.add(44);
		l1.add(45);
		l1.add(30);
		l1.add(null);
		
		Iterator itr =l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
		l2.add(5);
		l2.add(4);
		l2.add(75);
		l2.add(9);
		l2.add(null);
		
		for(Integer i : l2) {
			System.out.println(i);
		}
		
	}

}
