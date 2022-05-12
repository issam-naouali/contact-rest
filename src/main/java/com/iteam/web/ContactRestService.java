package com.iteam.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iteam.DAO.ContactRepository;

import com.iteam.entities.Contact;

@RestController
public class ContactRestService {
	@Autowired
	private ContactRepository compterepository;

	@GetMapping("/Contacts")
	public List<Contact> listContact() {
		List<Contact> contacts = compterepository.findAll();
		return contacts;
	}

	@GetMapping("/Contacts/{nom}")
	public List <Contact> getCompteById(@PathVariable(value = "nom") String nom) {
		return compterepository.findByNom(nom);
	}

	@GetMapping("/Contacts/Count")
	public int nbreContact() {
		List<Contact> contacts = compterepository.findAll();
		return contacts.size();
	}
	
	@DeleteMapping("/Contacts/{id}")
	public void DeleteContact (@PathVariable Long id) {
	  compterepository.deleteById(id);
	 }
	
	@PutMapping("/Contacts")
	public Contact UpdateContact(@RequestBody Contact contact) {
		return compterepository.save(contact);
	}
	@PostMapping("/Contacts")
	public Contact CreateContact(@RequestBody Contact ct) {
		
		return compterepository.save(ct);
	}
}


