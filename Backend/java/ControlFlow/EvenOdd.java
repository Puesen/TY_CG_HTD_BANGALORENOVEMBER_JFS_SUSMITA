import java.util.Scanner;

public class EvenOdd {
	public static void main(String[]arg)
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter NUMBER");
	int n=sc.nextInt ();
	
	switch(n%2)
	{
	case 1:
		System.out.println(n+ " is Odd number");
	    break;
	case 0:
	    System.out.println(n+ " is Even number");
	    break;
		
	}
	 }

}
