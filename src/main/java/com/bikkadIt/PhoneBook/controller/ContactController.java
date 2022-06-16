package com.bikkadIt.PhoneBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.PhoneBook.model.Contact;
import com.bikkadIt.PhoneBook.service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value = "/saveContact", consumes = "APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		boolean saveContact = contactServiceI.saveContact(contact);
		
		if(saveContact==true) {
			String msg="Contact data save sucessfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			String msg1="Contact data not saved";
			return new ResponseEntity<String>(msg1, HttpStatus.BAD_REQUEST);
		}
	
	}
}
