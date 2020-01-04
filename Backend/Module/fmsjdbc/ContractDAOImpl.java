


package com.cap.fmsjdbc.admin.contract;

import java.util.ArrayList;
import java.util.List;
//create one class which implements all methods ofContractDAO interface
public class ContractDAOImpl implements ContractDAO{
	List<ContractBean> contractbeans=new ArrayList<ContractBean>();//create one list object
//Override all unimplemented methods
	//write implementation of getAllContract() which is present in ContractDAO interface
	@Override
	public List<ContractBean> getAllContracts() {
		return contractbeans;
	}
	//write implementation of deleteContract() which is present in ContractDAO interface
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
	//write implementation of  getContract() which is present in ContractDAO interface
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
//write implementation of Contract() which is present in ContractDAO interface
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

}//end of class
