package com.capgimini.forestrymanagement1.admin.customer;

//create one class
public class CustomerDAOManager {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(); 	
	}
}//end of class
