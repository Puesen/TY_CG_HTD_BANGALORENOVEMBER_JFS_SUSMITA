package com.capgimini.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgimini.fms.beans.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO{

	private List<CustomerBean> customerBean=new ArrayList<CustomerBean>();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		for(CustomerBean cb2 : customerBean) {
			if(cb2.getId()==bean.getId()) {
				return false;
			}
		}	
		customerBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteCustomer(int id) {
		CustomerBean bean=null;
		for(CustomerBean customerBean2: customerBean) {
			if(customerBean2.getId()==id) {
				bean= customerBean2;

			}
		}	
		if(bean!=null) {
			customerBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CustomerBean> getallCustomer() {
		// TODO Auto-generated method stub
		return customerBean;
	}

}
