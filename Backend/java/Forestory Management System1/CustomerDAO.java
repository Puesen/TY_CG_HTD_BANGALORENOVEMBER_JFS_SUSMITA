package com.capgimini.fms.dao;

import java.util.List;

import com.capgimini.fms.beans.CustomerBean;

public interface CustomerDAO {

	boolean addCustomer(CustomerBean bean);
	boolean deleteCustomer(int id);	
	boolean modifyCustomer(CustomerBean bean);
	List<CustomerBean> getallCustomer();
}

