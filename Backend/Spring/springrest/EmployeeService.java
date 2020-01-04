package com.capgimini.springrest.service;

import java.util.List;

import com.capgimini.springrest.beans.EmployeeBean;

public interface EmployeeService {
	public EmployeeBean auth(String email, String password);
	public boolean register (EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String Key);
	public boolean changePassword(int id, String password);
	public boolean deleteEmployee(int id);	

}
