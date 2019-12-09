package treeset;

public class Employee implements Comparable<Employee>{

	int age;
	String name;
	int salary;


	public Employee(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}




	@Override
public int compareTo(Employee o) {
	if(this.age>o.age) {
		return 1;
	}else if(this.age<o.age) {
		return -1;
	}else {
	return age;
	}
	
	}}
