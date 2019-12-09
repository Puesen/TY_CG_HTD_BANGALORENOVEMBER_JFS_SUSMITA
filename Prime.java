import java.util.Scanner;
public class Prime {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int count=0,i=1;
while(i<=n)
{
	
	if(n%i==0)
		count=count+1;
	   if(count>2)
		   break;
	i++;
	
	}
	if (count==2)
		System.out.println(n+ "is a prime");
	else
		System.out.println(n +" not a prime number");

}
}



