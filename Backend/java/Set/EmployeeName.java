package treeset;

public class EmployeeName implements Comparable<EmployeeName>{

	int age;
	String name;
	int salary;


	public EmployeeName(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}




	public EmployeeName() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}




	/*@Override
public int compareTo(Employee o) {
	if(this.age>o.age) {
		return 1;
	}else if(this.age<o.age) {
		return -1;
	}else {
	return age;
	}*/

	@Override
	public int compareTo(EmployeeName o) {
		return this.name.compareTo(o.name); 
	}

}