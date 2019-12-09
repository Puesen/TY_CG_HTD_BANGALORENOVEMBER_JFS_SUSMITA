import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int sum=0,i=1;
while(i<=n/2)
{
	if(n%i==0)
		sum=sum+i;
	i++;
	
	}
	if (sum==n)
		System.out.println(n+ "is a perfect number");
	else
		System.out.println(n +"not a perfect number");

}
}
