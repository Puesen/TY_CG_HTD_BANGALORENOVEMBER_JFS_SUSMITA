package com.capgimini.firstwebapp.dao;

import java.util.List;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	public EmployeeInfoBean authenticate(int empId, String password);
	public EmployeeInfoBean searchEmployee(int empid);
	
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empid);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean> getAllEmployees();

}
