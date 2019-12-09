import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1= new Vector();
	
	v1.add(58);
	v1.add(13);
	v1.add(28);
	v1.add(78);
	System.out.println(v1);
	v1.remove(1);
	System.out.println(v1);
	
	v1.set(1, 3);
	System.out.println(" for loop");
	for(int i=0;i<v1.size();i++)
	{
		System.out.println(v1.get(i));
	}
	
	
}
}
