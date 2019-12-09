import java.util.Scanner;
public class Amstrong {
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
    int prod=1,mod=0,sum=0;
    int m=n;
    while(n>0)
    {
    	mod=n%10;
	sum=sum+mod*mod*mod;
	n=n/10;
	
    }
    
    if (sum==m)
		System.out.println(m+ "is an Amstrong Number");
	else
		System.out.println(m +" not an Amstrong Number");


}
}
