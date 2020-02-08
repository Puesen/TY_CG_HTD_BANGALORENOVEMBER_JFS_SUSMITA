package com.capgemini.bookmydoctor.services;


import java.util.ArrayList;

import com.capgemini.bookmydoctor.dto.Contact;

public interface ContactServices {

	public boolean addContact(Contact contact);

	public boolean deleteContact(int contactId);

	public ArrayList<Contact> getAllContact();
}
