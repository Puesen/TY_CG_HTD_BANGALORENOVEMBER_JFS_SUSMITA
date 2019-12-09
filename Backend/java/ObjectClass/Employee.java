
public class Employee {

	int empId2;
	String empName2;
	
	public Employee(int empId2, String empName2) {
		super();
		this.empId2 = empId2;
		this.empName2 = empName2;
	}
	public boolean equals(Object obj) {
		Employee e1=(Employee) obj;
		if(e1.empId2==this.empId2) {
			
			if(e1.empName2.equals(this.empName2));
			 return true;
			
		}else
		{
			return false;
		}
		
	
	}
}
