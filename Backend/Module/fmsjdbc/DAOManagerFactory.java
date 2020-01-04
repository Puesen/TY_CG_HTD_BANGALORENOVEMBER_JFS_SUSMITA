package com.cap.fmsjdbc.admin.customer;

public class DAOManagerFactory {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(); 	
	}
}
