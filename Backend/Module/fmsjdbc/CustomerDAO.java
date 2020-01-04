package com.cap.fmsjdbc.admin.customer;


public interface CustomerDAO {
	public CustomerBean getAllCustomers() ;
	public boolean deleteCustomer(int customerid);
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(int customerid,CustomerBean bean);
	public CustomerBean getCustomer(int customerid);

}
