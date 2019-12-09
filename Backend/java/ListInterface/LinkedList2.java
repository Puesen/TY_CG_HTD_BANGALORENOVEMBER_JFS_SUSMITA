import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(23);
	l1.add(65);
	System.out.println(l1);
	
	l1.addFirst(45);//add first
	System.out.println(l1);
	
	l1.addLast(89);//add last
	System.out.println(l1);
	
	l1.remove();//remove
	System.out.println(l1);
	// remove first remove last
	System.out.println("-------------Remove first remove last-----------");
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
	
	
	LinkedList l2=new LinkedList();
	l2.add(23);
	l2.add(45);
	l2.add(46);
	l2.add(45);
	l2.add(89);
	System.out.println(l2);

	l2.removeFirstOccurrence(45);//remove first occurrence
	System.out.println(l2);//remove last occurrence

	l2.removeLastOccurrence(45);
	System.out.println(l2);

    System.out.println(l2.getFirst());//get first
    System.out.println(l2.getLast());//get last

}
}
