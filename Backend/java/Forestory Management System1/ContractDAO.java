package com.capgimini.fms.dao;

import java.util.List;

public interface ContractDAO {

	boolean addContract(ContractBean bean);
	boolean deleteContract(int id);
	List ShowContract();
}
