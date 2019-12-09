import java.util.Scanner;
public class Multiple {

	
	public static void main(String[]arg)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Multiple of 3 within 100");
int n=sc.nextInt();
int count=0,i=1;
while(i<=100)
{
	
	if(i%3==0)
		count=count+1;
	i++;


}
		System.out.println(count);
	}
}

