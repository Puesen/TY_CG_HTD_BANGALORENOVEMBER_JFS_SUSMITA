package com.cap.fmsjdbc.admin.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAOImpl implements CustomerDAO {
	Map<Integer,CustomerBean> customerbeans=new HashMap<Integer, CustomerBean>();
    int cid=0;
	@Override
	public CustomerBean getAllCustomers() {
		if(customerbeans!=null) {
    System.out.println(customerbeans);
		}
	return null;	
		
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		if(customerbeans!=null) {
			customerbeans.remove(customerid);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
	while(true) {
		++cid;
		customerbeans.put(cid, bean);
		return true;
	}
	}

	@Override
	public boolean modifyCustomer(int customerid,CustomerBean bean) {
		customerbeans.replace(customerid, bean);
		return true;
	}

	@Override
	public CustomerBean getCustomer(int customerid) {
		if(customerbeans.containsKey(customerid)==true) {
			return customerbeans.get(customerid);
		}else {
			return null;
		}
		
	}



}
