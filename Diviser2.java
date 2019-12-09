import java.util.Scanner;
public class Diviser2 
{
	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int count=0;int i = 1;
while(i<=n/2)
{
	if(n%i==0)
		count=count+1;
	i++;
	
	}
	
		System.out.println(count+ " diviser");
	}
}
