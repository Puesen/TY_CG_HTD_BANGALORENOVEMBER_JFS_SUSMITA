package com.capgimini.firstwebapp.service;

import java.util.List;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;
import com.capgimini.firstwebapp.dao.EmployeeDAO;
import com.capgimini.firstwebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public EmployeeInfoBean searchEmployee(int empid) {

		return dao. searchEmployee(empid);
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {

		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean deleteEmployee(int empid) {

		return dao.deleteEmployee(empid);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {

		return dao.updateEmployee(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {

		return dao.getAllEmployees();
	}


}
