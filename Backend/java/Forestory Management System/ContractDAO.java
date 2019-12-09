package com.capgimini.fms.dao;

import java.util.List;

import com.capgimini.fms.beans.ContractBean;

public interface ContractDAO {

	boolean addContract(ContractBean bean);
	boolean deleteContract(int id);
	List ShowContract();

}
