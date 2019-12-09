
import java.util.ListIterator;
import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("pue");
		a1.add("ashu");
		a1.add("hemu");
		
		System.out.println(a1);
		System.out.println("----------forLoop--------");
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			
		}
		System.out.println("----------forEachLoop--------");
		for(String i1: a1) {
			System.out.println(i1);
			
		}
System.out.println("----------iterator method--------");
		
		ListIterator<String> itr= a1.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
System.out.println("---------- list iterator--------");
		
		ListIterator<String> itr1= a1.listIterator(a1.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		ArrayList<String> a2=new ArrayList<String>();
		  a2.add("mou");
		  a2.add("ashim");
		  System.out.println(a2);
		  a2.remove(new String("ashim"));
		  System.out.println(a2);

		
		
}
	

}