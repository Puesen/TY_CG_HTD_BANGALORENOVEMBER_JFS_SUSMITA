package com.capgimini.empspring1.service;

import java.util.List;

import com.capgimini.empspring1.bean.EmployeeBean;

public interface EmployeeService {
	public EmployeeBean auth(String email, String password);
	public boolean register (EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String Key);
	public boolean changePassword(int id, String password);
	

}
