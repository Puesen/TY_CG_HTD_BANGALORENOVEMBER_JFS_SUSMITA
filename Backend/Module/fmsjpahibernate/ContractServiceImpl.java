package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.ContractDAO;
import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.factory.DAOManager;


public class ContractServiceImpl implements ContractService{
	ContractDAO dao=DAOManager.instanceOfContactDAOImpl();

	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

	public boolean addContract(ContractBean bean1) {
		return dao.addContract(bean1);
	}

	public boolean deleteContract() {
		return dao.deleteContract();
	}

}
