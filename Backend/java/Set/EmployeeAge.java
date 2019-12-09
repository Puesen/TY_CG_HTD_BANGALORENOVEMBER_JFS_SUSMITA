package treeset;

public class EmployeeAge implements Comparable<EmployeeAge>{

	int age;
	String name;
	int salary;


	public EmployeeAge(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}




	public EmployeeAge() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}




	@Override
public int compareTo(EmployeeAge o) {
	if(this.age>o.age) {
		return 1;
	}else if(this.age<o.age) {
		return -1;
	}else {
	return age;
	}
	
	}}
