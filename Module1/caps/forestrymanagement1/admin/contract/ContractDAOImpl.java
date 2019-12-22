package com.caps.forestrymanagement1.admin.contract;

import java.util.ArrayList;
import java.util.List;



public class ContractDAOImpl implements ContractDAO{
	List<ContractBean> contractbeans=new ArrayList<ContractBean>();
	@Override
	public List<ContractBean> getAllContracts() {
		return contractbeans;
	}

	@Override
	public boolean deleteContract(int contractno) {
		ContractBean bean=null;
       for (ContractBean contractBean : contractbeans) {
    	   if(contractBean.getContractno()==contractno) {
    	    	  bean=contractBean;
    	       }
       }
    	       if(bean!=null) {
    	       contractbeans.remove(bean);
    	       return true;
    	       }
	
		return false;
	}

	@Override
	public ContractBean getContract(int contractno) {
		for (ContractBean contractBean : contractbeans) {
			if(contractBean.getContractno()==contractno) {
				return contractBean;
			}else {
				System.out.println("Contact number doesnot match");
			}
		}
		return null;
	}

	@Override
	public boolean addContract(ContractBean bean) {
		for (ContractBean contractBean : contractbeans) {
			if(contractBean.getContractno()==bean.getContractno()) 
			{
				return false;
			}
		}
		contractbeans.add(bean);
		
		return true;
	}

	

	

}
