package com.capgimini.forestrymanagementjdbc.admin.contract;

import java.util.List;


public class ContractServiceImpl implements ContractService{
	ContractDAO dao=DAOManager.instanceOfContactDAOImpl();

	@Override
	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();

	}


	@Override
	public boolean addContract(ContractBean bean1) {
		return dao.addContract(bean1);
	}


	@Override
	public boolean deleteContract(long contractno3) {
		return dao.deleteContract(contractno3);
	}

}
