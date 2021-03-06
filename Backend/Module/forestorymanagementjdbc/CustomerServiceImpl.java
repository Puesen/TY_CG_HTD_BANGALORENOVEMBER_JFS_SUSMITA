package com.capgimini.forestrymanagementjdbc.admin.customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAO dao=CustomerDAOManager.instanceOfCustomerDAOImpl();

	@Override
	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

	@Override
	public boolean deleteCustomer(int customerid3) {
		return dao.deleteCustomer(customerid3);
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		return dao.modifyCustomer(bean);
	}

}
