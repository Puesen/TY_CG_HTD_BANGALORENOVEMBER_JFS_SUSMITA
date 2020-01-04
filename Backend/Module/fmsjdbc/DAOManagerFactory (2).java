package com.cap.fmsjdbc.admin.contract;


public class DAOManagerFactory {

	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl(); 	
	}
	

}
