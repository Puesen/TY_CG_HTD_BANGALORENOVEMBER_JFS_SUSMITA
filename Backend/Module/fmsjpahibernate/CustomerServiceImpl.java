package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.CustomerDAO;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.factory.CustomerDAOManager;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAO dao=CustomerDAOManager.instanceOfCustomerDAOImpl();

	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	public boolean deleteCustomer() {
		// TODO Auto-generated method stub
		return dao.deleteCustomer();
	}

	public boolean addCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		return dao.addCustomer(bean);
	}

	public boolean modifyCustomer() {
		// TODO Auto-generated method stub
		return dao.modifyCustomer();
	}

	
}
