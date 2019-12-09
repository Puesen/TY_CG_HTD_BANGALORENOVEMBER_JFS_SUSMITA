
import java.util.Scanner;
public class Diviser1 {

	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the N value");
int n=sc.nextInt();
int count=0,i=1;
while(i<=n)
{
	
	if((i%5==0)||(i%7==0))
		count=count+1;
	i++;

	
	}
	
		System.out.println(n +" has " +count+ " Divisers ");
}




}