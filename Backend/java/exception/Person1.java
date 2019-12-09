package checkedException;

public class Person1 {
public static void main(String[] args) {
	System.out.println("Main Started");
	Election e1=new Election();
	
	try {
		e1.vote(15);
	}catch(AgeLimitException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Main Ended");
}
}
  