import java.util.Scanner;
public class ProductOfDigits {
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
    int prod=1,mod=0;
    while(n>0)
    {
    	mod=n%10;
    	prod=prod*mod;
        n=n/10;
    
    }
   	
	System.out.println("Sum of digits of number = " +prod);
}
}

