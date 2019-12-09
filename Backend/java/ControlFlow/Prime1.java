
import java.util.Scanner;
public class Prime1 {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");

int n=0;
while(++n<=100)
{
	int count=1,i=1;
	while(i<n/2) {
	
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
}


