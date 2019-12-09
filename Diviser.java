import java.util.Scanner;
public class Diviser {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int count=0,i=1;
while(i<=n)
{
	if(n%i==0)
		System.out.println(i);

	if(n%i==0)
		count=count+1;
	i++;
	
	}
	
		System.out.println(n +" has " +count+ " Divisers ");
}
}



