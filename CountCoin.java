import java.util.Scanner;
public class CountCoin {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int fc=n/5;
System.out.println("number of 5 rupees coins are:" +fc);
int tc=(n%5/2);
System.out.println("number of 2 rupees coins are:" +tc);
int oc=n%5%2;
System.out.println("number of 1 rupees coins are:" +oc);
System.out.println("Total Number of Coins are "+ (fc+tc+oc));

	}
}



