
public class Demo3 {
public static void main(String[] args) {
	String s1="John";
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.length());
	
	String s2="  John Mickel  ";
	System.out.println(s2.trim());//only end spaces are removed
	
	String s4=s1.substring(2);
	System.out.println(s4);

String s5="Anindya";
System.out.println(s5.substring(3, 6));

String s6="ShreiShrei";
System.out.println(s6.charAt(4));

System.out.println(s6.indexOf('h'));
System.out.println(s6.indexOf("re", 4));
System.out.println(s6.indexOf("re"));
System.out.println(s6.lastIndexOf("r",2 ));
}

}
