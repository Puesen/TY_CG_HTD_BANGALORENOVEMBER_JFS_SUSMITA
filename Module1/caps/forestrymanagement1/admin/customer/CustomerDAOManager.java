package com.caps.forestrymanagement1.admin.customer;

public class CustomerDAOManager {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(); 	
	}
}
