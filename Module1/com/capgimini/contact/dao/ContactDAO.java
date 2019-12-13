package com.capgimini.contact.dao;

import java.util.List;

import com.capgimini.contact.bean.Contactbean;


public interface ContactDAO {

	boolean addContract(Contactbean bean);
	boolean modifyContact(int name);
	boolean deleteContract(int name);
	List ShowContact();
	

}
