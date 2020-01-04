package com.capgimini.forestrymanagement1.admin.customer;

import java.util.List;

//create one interface CustomerDAO
public interface CustomerDAO {
	//declare some methods 
	public List<CustomerBean> getAllCustomers() ;
	public boolean deleteCustomer(int customerid3);
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(int custId);
	public CustomerBean getCustomer(int customerid);

}//end one interface
