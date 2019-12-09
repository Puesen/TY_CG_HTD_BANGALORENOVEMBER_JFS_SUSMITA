package com.capgimini.fms.app;

import com.capgimini.fms.dao.ContractDAO;
import com.capgimini.fms.dao.ContractDAOImpl;

public class ContractDAOManagerFactory {
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl();
		
	}
}
