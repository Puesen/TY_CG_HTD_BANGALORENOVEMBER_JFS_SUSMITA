package com.capgimini.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgimini.fms.beans.ContractBean;

public class ContractDAOImpl implements ContractDAO{
	private List<ContractBean> contractBean=new ArrayList<ContractBean>();


	public boolean addContract(ContractBean bean) {
		for(ContractBean cb2:contractBean) {
			if(cb2.getContractno()== bean.getContractno()) {
				return false;
			}
		}
		contractBean.add(bean);
		return false;
	
	}

	@Override
	public boolean deleteContract(int ContractNumber) {
		ContractBean bean =null;
		for(ContractBean ContractBean2:contractBean) 
		{
			if(ContractBean2.getContractno()==ContractNumber) {
				bean=ContractBean2;
			}
		}
		if(bean!= null) {
			contractBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public List ShowContract() {
		// TODO Auto-generated method stub
		return contractBean;
	}

	
}
