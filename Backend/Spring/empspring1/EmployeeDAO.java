package com.capgimini.empspring1.dao;

import java.util.List;

import com.capgimini.empspring1.bean.EmployeeBean;

public interface EmployeeDAO {
	public EmployeeBean auth(String email, String password);
	public boolean register (EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String Key);
	public boolean changePassword(int id, String password);
	

}
