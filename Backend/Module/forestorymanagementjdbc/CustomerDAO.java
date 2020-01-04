package com.capgimini.forestrymanagementjdbc.admin.customer;

import java.util.List;

//create one interface CustomerDAO
public interface CustomerDAO {
	//declare some methods 
	public List<CustomerBean> getAllCustomers() ;
	public boolean deleteCustomer(int customerid3);
	public boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(CustomerBean bean);

}//end one interface
