package com.caps.forestrymanagement1.admin.contract;

import java.util.List;

import com.caps.forestrymanagement1.admin.product.ProductBean;



public interface ContractDAO {
	public List<ContractBean> getAllContracts() ;
	public boolean deleteContract(int contractno);
	public ContractBean getContract(int contractno);
	public boolean addContract(ContractBean bean);
	

}
