import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(15);
		a1.add(13);
		
		System.out.println(a1);
		System.out.println("----------forLoop--------");
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			
		}
		System.out.println("----------forEachLoop--------");
		for(Integer i1: a1) {
			System.out.println(i1);
			
		}
System.out.println("----------iterator method--------");
		
		ListIterator<Integer> itr= a1.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
System.out.println("---------- list iterator--------");
		
		ListIterator<Integer> itr1= a1.listIterator(a1.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		ArrayList<Integer> a2=new ArrayList<Integer>();
		  a2.add(23);
		  a2.add(24);
		  a2.add(24);
		  System.out.println(a2);
		  a2.remove(new Integer(23));
		  System.out.println(a2);

		
		
}
	

}