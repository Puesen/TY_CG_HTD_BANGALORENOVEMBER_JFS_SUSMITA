import java.util.Scanner;
public class SumOfDigitDoWhile{
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
    int sum=0,mod=0;
    do
    {
    	mod=n%10;
    	sum=sum+mod;
    	n=n/10;
    }
   	while(n!=0);
	System.out.println("Sum of digits of number = " +sum);
}
}

