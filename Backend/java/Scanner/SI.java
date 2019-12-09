import java.util.Scanner;
public class SI {



public static void main(String[]arg)
 {
Scanner kb=new Scanner(System.in);
System.out.println("Enter the Principle Amount");
int p=kb.nextInt ();
System.out.println("Enter the Rate of interest");
int r=kb.nextInt ();
System.out.println("Enter the Time");
int t=kb.nextInt ();

double SI=(p*r*t)/100;
System.out.println(" Area of Square is " +SI);
}
}







