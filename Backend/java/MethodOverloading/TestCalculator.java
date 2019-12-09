
public class TestCalculator {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	 int r1=c1.add(12);
	 System.out.println("result 1 is" + r1);
	 int r2=c1.add(15,1548);
	 System.out.println("result 2 is" + r2);
	 double r3=c1.add(45.215);
	 System.out.println("result 3 is" + r3);
	 
	 Calculator.multiply(15);
	 Calculator.multiply(12, 3);
	 Calculator.multiply(10.5);
	 
}
}
