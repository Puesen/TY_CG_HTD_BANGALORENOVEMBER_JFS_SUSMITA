import java.util.LinkedList;

public class LinkedList4 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(45);
	l1.add(12);
	l1.add(81);
	l1.add(36);
	
	l1.push(1010);
	System.out.println(l1);
	l1.pop();
	System.out.println(l1);
	System.out.println(l1.element());
	System.out.println(l1);
	
}
}
