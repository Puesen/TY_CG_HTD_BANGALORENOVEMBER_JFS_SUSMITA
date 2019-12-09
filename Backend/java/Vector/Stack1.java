import java.util.Stack;
import java.util.Vector;

public class Stack1{
public static void main(String[] args) {
	Stack s1=new Stack();

	s1.add(34);
	s1.add(88);
	s1.push(85);
	System.out.println(s1);
	s1.pop();
	System.out.println(s1);
	System.out.println(s1.peek());
	System.out.println(s1);
	System.out.println(s1.search(34));
	System.out.println(s1);

	
}
}
