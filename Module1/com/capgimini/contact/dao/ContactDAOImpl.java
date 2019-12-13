package com.capgimini.contact.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgimini.contact.bean.Contactbean;

public class ContactDAOImpl implements ContactDAO{
	private List<Contactbean> contactBean=new ArrayList<Contactbean>();
	@Override
	public boolean addContract(Contactbean bean) {
		for(Contactbean cb:contactBean) {
			if(cb.getName()== bean.getName()) {
				return false;
			}
		}
		contactBean.add(bean);
		return false;

	}

	@Override
	public boolean modifyContact(int name) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("1.Update Contact Number\n 2. Update Group ");
			int ch=sc.nextInt();
			System.out.println("Enter the name to update details");
			String name1=sc.next();
			switch(ch) {

			case 1:
				System.out.println("Enter the Contact Number");
				updateContactNumber(name1,sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the new Group");
				updateGroup(name1,sc.next());
				break;
			}
			return true;
		}		
	}


	private void updateGroup(String name1, String next) {
		// TODO Auto-generated method stub
		
	}

	private void updateContactNumber(String name1, int nextInt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteContract(int name) {
		Contactbean bean =null;
		for(Contactbean con:contactBean) 
		{
			if(con.getName()==name) {
				bean=con;
			}
		}
		if(bean!= null) {
			contactBean.remove(bean);
			return true;
		}
		return false;
	}


	@Override
	public List ShowContact() {
		// TODO Auto-generated method stub
		return contactBean;
	}

}
