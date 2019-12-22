package com.caps.forestrymanagement1.admin.customer;

import java.util.List;

import com.caps.forestrymanagement1.admin.contract.ContractBean;

public interface CustomerDAO {
	public CustomerBean getAllCustomers() ;
	public boolean deleteCustomer(int customerid);
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(int customerid,CustomerBean bean);
	public CustomerBean getCustomer(int customerid);

}
