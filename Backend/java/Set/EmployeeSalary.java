package treeset;

public class EmployeeSalary implements Comparable<EmployeeSalary>{

	int age;
	String name;
	int salary;


	public EmployeeSalary(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}




	public EmployeeSalary() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}




	@Override
public int compareTo(EmployeeSalary o) {
	if(this.salary>o.salary) {
		return 1;
	}else if(this.salary<o.salary) {
		return -1;
	}else {
	return age;
	}
	
	}}
