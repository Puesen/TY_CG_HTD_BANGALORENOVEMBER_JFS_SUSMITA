package com.capgimini.fms.dao;

import java.util.ArrayList;
import java.util.List;

public class ContractDAOImpl implements ContractDAO {

	private List<ContractBean> contractBean=new ArrayList<ContractBean>();

	@Override
	public boolean addContract(ContractBean bean) {
		for(ContractBean cb2:contractBean) {
			if(cb2.getContractNumber()== bean.getContractNumber()) {
				return false;
			}
		}
	
	}

	@Override
	public boolean deleteContract(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List ShowContract() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
