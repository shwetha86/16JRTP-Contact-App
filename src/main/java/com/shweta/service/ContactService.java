package com.shweta.service;

import java.util.List;

import com.shweta.entity.Contact;

public interface ContactService {
	
	public boolean saveContact();
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public void deleteContactById(Integer contactId);
	

}
