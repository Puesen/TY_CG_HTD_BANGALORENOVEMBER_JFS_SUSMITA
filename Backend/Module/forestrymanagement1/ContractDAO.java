
package com.capgimini.forestrymanagement1.admin.contract;

import java.util.List;

import com.capgimini.forestrymanagement1.admin.product.ProductBean;


//create one interface
public interface ContractDAO {
	//define methods which we want to implement
	public List<ContractBean> getAllContracts() ;
	public ContractBean getContract(Long contractno);
	public boolean addContract(ContractBean bean1);
	public boolean deleteContract(Long contractno3);
}//end of interface
