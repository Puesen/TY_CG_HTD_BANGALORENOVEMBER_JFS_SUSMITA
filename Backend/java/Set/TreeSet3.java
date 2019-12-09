package treeset;

import java.util.TreeSet;

public class TreeSet3 {
public static void main(String[] args) {
	
	EmployeeName e1=new EmployeeName();
	EmployeeAge e2=new EmployeeAge();
	EmployeeSalary e3=new EmployeeSalary();
	
	TreeSet<Employee> t1=new TreeSet<Employee>();
	
	t1.add(new Employee(21,"Johnny",7822));
	t1.add(new Employee(21,"Johnny",12451));
	t1.add(new Employee(1,"Yes",4444));
	t1.add(new Employee(50,"Pappa",101010));
	t1.add(new Employee(2,"Suger",70730));
	
	for(Employee m :t1) {
		System.out.println (e1.name);
	}
	
	
	
}
}
