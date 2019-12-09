import java.util.Scanner;

public class Factorial {

	public static void main(String[]arg)
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the N Value");
	int n=sc.nextInt ();
	int i=1,f=1;
	while(i<=n)
	{
		f=f*i;
		i++;
	}
	System.out.println(n +"! =" + f);

}
}
