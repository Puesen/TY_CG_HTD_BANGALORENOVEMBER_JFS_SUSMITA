package com.capgimini.forestrymanagement1.admin.contract;

//Create one class
public class DAOManager {
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl(); 	//return ContractDAOImpl()
	}
	
}//end of class
