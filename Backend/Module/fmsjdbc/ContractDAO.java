
package com.cap.fmsjdbc.admin.contract;

import java.util.List;

import com.capgimini.forestrymanagement1.admin.product.ProductBean;


//create one interface
public interface ContractDAO {
	//define methods which we want to implement
	public List<ContractBean> getAllContracts() ;
	public ContractBean getContract(int contractno);
	public boolean addContract(ContractBean bean1);
	public boolean deleteContract(int contractno3);
}//end of interface
