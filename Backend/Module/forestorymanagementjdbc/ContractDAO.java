
package com.capgimini.forestrymanagementjdbc.admin.contract;

import java.util.List;

//create one interface
public interface ContractDAO {
	//define methods which we want to implement
	public List<ContractBean> getAllContracts() ;
	public boolean addContract(ContractBean bean1);
	public boolean deleteContract(long contractno3);
}//end of interface
