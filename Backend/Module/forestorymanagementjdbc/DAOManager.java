package com.capgimini.forestrymanagementjdbc.admin.contract;


//Create one class
public class DAOManager {
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl(); 	//return ContractDAOImpl()
	}

	public static ContractDAO instanceOfContactDAOImpl() {
		ContractDAO dao= new ContractDAOImpl();
		return dao;
	   }

	public static ContractService instanceOfContactServiceImpl() {
		ContractService service= new ContractServiceImpl();
		return service;
	   }
	
}//end of class
