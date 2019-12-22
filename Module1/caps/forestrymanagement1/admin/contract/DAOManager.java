package com.caps.forestrymanagement1.admin.contract;


public class DAOManager {
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl(); 	
	}
	
}
