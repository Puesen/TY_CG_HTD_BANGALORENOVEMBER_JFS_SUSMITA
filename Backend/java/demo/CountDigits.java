import java.util.Scanner;
public class CountDigits {
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
    int count=0,mod=0;
    while(n>0)
    {
    	n=n/10;
        count++;
    
    }
   	
	System.out.println("Sum of digits of number = " +count);
}
}


