import java.util.Scanner;

public class ElseIf {
	public static void main(String[]arg)
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your CHOICE");
	int mno=sc.nextInt ();

	if(mno==1||mno==3||mno==5||mno==8||mno==10||mno==12)
		System.out.println("31 days");
	else 
		if(mno==4||mno==6||mno==9||mno==11)
			System.out.println("30 days");

	
    else
    	System.out.println("28 Days");
			
	 }

}



