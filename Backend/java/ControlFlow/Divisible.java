import java.util.Scanner;
public class Divisible {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int count=0,i=0;
while(i<n)
{
	
if((n%5==0)||(n%7==0))
		count=count+1;
}
i++;

	
	
		System.out.println(n +" has " +count+ " Divisers ");
}
}





