import java.io.FileOutputStream;

public class FileOutput {
public static void main(String[] args) {

	try {
		FileOutputStream f1 = new FileOutputStream("anu.txt");
		String s1="Divya bogar";
		
		byte b1[]=s1.getBytes();
		f1.write(b1);
		System.out.println("File Created Successfully");

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}
