package com.capgimini.contact.app;

import com.capgimini.contact.dao.ContactDAO;
import com.capgimini.contact.dao.ContactDAOImpl;

public class ContactDAOManagerFactory {
	public static ContactDAO getContractDAO() {
		return new ContactDAOImpl();
		
	}
}
