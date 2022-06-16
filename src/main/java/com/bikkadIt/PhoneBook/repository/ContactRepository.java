package com.bikkadIt.PhoneBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.PhoneBook.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	
}
