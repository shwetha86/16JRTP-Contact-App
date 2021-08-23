package com.shweta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shweta.entity.Contact;
import com.shweta.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepo;

	
	@Override
	public boolean saveContact() {
		contactRepo.save(null);
		
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		
		return contactRepo.findById(contactId).orElse(null);
	}

	@Override
	public void deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		contactRepo.deleteById(contactId);
	}

}
