import java.util.Vector;

public class Vector3 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.addElement(24);
	v1.addElement(45);
	v1.addElement(78);
	v1.addElement(25);
	v1.add(77);
	System.out.println(v1);
	v1.removeElement(new Integer (24));
	System.out.println(v1);
	v1.removeElementAt(2);
	System.out.println(v1);
	
	Object i1[]=new Object[v1.size()];
	v1.copyInto(i1);
	
	for(int i=0;i<i1.length;i++) {
		System.out.println(i1[i]);
	}
	v1.removeAllElements();
	System.out.println(v1);

	

	
}
}
