package nestedtry;

public class ExceptionC {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Employee e1=new Employee();
		try {
			Object o1=e1.clone();
			try {
				Class c1=Class.forName("nestedtry.Employee");
				System.out.println("Class is Found");
			}catch(ClassNotFoundException e) {
				System.out.println("Class Not Found");
			}
			
		}catch(CloneNotSupportedException e){
		System.out.println("Clone not supported");	
		}
		System.out.println("Main Ended");
	}

}
