import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet  hs=new HashSet();
	
	hs.add(23);
	hs.add(89);
	hs.add(12);
	hs.add(44);
	hs.add(23);
	hs.add(null);
	
	for(Object object:hs) {
		System.out.println(object);
	}
	
	
	HashSet<String> hs1=new HashSet<String>();
    
	hs1.add("Shree");
	hs1.add("anu");
	hs1.add("rima");
	hs1.add("rupa");
	hs1.add("binita");

	for (String s: hs1) {
		System.out.println(s);
	}
}
}
