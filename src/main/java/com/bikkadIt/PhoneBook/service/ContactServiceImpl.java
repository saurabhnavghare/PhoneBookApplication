package com.bikkadIt.PhoneBook.service;

import com.bikkadIt.PhoneBook.model.Contact;
import com.bikkadIt.PhoneBook.repository.ContactRepository;

public class ContactServiceImpl implements ContactServiceI {

	private ContactRepository contactRepository;

	
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);

		if (save != null) {
			return true;
		} else {
			return false;
		}
	}

}
