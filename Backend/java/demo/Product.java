import java.util.Scanner;
public class Product {
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name of the product");
	String st=sc.next();
	System.out.println("Enter the price of the Product:");
	int price=sc.nextInt();
	System.out.println("Enter the Money:");
	int money=sc.nextInt();
	System.out.println("You Can Purchase " +money/price+ " "+ st+ " Product" );
	System.out.println("You have to collect the change Rs "+money%price);
	
	
	
}
	

}
