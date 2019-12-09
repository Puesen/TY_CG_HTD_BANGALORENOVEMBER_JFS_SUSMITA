import java.io.FileInputStream;

public class FileInput {
public static void main(String[] args) {
	try {
		FileInputStream f1 = new FileInputStream("anu.txt");
		int a=f1.read();
		
		System.out.println((char)a);
		
		while((a=f1.read())!=-1) {
			System.out.println((char)a);
		}

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}
