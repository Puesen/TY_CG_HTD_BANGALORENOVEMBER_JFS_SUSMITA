package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ContractBean;

public interface ContractService {

	//define methods which we want to implement
	public List<ContractBean> getAllContracts() ;
	
	public boolean addContract(ContractBean bean1);
	public boolean deleteContract();
}//end of interface


