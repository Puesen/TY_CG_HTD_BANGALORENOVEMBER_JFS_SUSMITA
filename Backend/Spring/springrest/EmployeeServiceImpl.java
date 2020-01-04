package com.capgimini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgimini.springrest.beans.EmployeeAddressBean;
import com.capgimini.springrest.beans.EmployeeBean;
import com.capgimini.springrest.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		// TODO Auto-generated method stub
		return dao.auth(email, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		List<EmployeeAddressBean> addressBeans = bean.getAddressBeans();
		for (EmployeeAddressBean empAddressBean : addressBeans)
			empAddressBean.setBean(bean);
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String Key) {
		// TODO Auto-generated method stub
		return dao.getEmployees(Key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

}
