import java.util.Scanner;
public class LeapYear {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year");
int n=sc.nextInt();
int a=n/4;
int b=n/100;

int c=n/400;

System.out.println("Total Number of Leap Years are "+ (a+b+c));

	}
}
