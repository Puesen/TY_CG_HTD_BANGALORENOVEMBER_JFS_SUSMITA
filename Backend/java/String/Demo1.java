
public class Demo1 {
public static void main(String[] args) {
	String s1="John";
	System.out.println(s1.hashCode());
	String s2="Mikel";
	s1="Pinky";
	String s3="John";
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
}
}
