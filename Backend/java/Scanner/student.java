import java.util.Scanner;
public class student {



public static void main(String[]arg)
 {
Scanner kb=new Scanner(System.in);
System.out.println("Enter the marks");
int a=kb.nextInt ();
int b=kb.nextInt ();
int c=kb.nextInt ();
int d=kb.nextInt ();

System.out.println(" Total marks is " + (a+b+c+d));
System.out.println(" Percentage is " + ((a+b+c+d)/4));

}
}

