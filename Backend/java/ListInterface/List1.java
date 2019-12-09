import java.util.List;
import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		
		l1.add(0,12);
		l1.add(1,15);
		l1.add(2,13);
		l1.add(3,98);
		l1.add(4,87);
		l1.add(1,110);
		
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		System.out.println(l1.lastIndexOf(110));
		System.out.println("-----------------");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
			
			List l2=new ArrayList();
			l2.add(45);
			l2.add(55);
			l2.add(66);
			System.out.println(l2);
			
			List l3=new ArrayList();
			l3.add(0,12);
			l3.add(1,15);
			l3.add(2,158);
			System.out.println(l3);
			System.out.println(l3.set(2, 99));

		
			
			List l4=new ArrayList();
			l4.add(33);
			l4.add(14);
			l4.add(22);
			l4.add(1,1000);
			System.out.println(l4);
			System.out.println(l4.set(2, 99));
			System.out.println(l4);
			
			
			
			List l6=l4.subList(0, 2);
			System.out.println(l6);
			
			
			
			
			
			
			
			
		
		
	}

}
