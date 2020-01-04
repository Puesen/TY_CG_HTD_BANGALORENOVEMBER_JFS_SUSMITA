package com.capgimini.forestrymanagementjdbc.admin.customer;


//create one class
public class CustomerDAOManager {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(); 	
	}

	public static CustomerDAO instanceOfCustomerDAOImpl() {
		CustomerDAO dao= new CustomerDAOImpl();
		return dao;
	   }

	public static CustomerService instanceOfCustomerServiceImpl() {
		CustomerService service= new CustomerServiceImpl();
		return service;
	}

	
}//end of class
