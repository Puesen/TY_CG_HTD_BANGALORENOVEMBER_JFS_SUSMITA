package com.capgimini.fms.app;

import com.capgimini.fms.dao.CustomerDAO;
import com.capgimini.fms.dao.CustomerDAOImpl;

public class CustomerDAOManagerFactory {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
		
	}
}
