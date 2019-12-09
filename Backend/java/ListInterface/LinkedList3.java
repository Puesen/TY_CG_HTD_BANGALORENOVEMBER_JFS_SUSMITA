import java.util.LinkedList;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList() ;

	l1.add(26);
	l1.add(56);
	l1.add(64);
	l1.add(85);
	System.out.println("-----------Peek and peeFirst and peekLast------------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("-----------poll and pollFirst and pollLast-----------");
	    System.out.println(l1.poll());
	    System.out.println(l1);
	    System.out.println(l1.pollFirst());
	    System.out.println(l1.pollLast());
	    
	    System.out.println("---------offer offerFirst offerLast------------");
	    System.out.println(l1.offer(26)); System.out.println(l1.offer(40));
	    System.out.println(l1.offerFirst(90));
	    System.out.println(l1.offerLast(45));
	    System.out.println(l1);
	    
	    
	    System.out.println("--------push pop elements---------");
	    l1.push(77);
	    System.out.println(l1);
	    l1.pop();l1.pop();
	    System.out.println(l1);
	    
	    System.out.println(l1.element());
}
}
