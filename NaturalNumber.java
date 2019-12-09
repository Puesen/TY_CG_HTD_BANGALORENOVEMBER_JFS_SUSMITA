import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[]arg)
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the N Valur");
	int n=sc.nextInt ();
	int i=1,sum=0;
	while(i<=n)
	{
		sum=sum+i;
		i++;
	}
	System.out.println("Sum of First" +n + "numbers is" + sum);

}
}