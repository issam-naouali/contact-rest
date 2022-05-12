package com.iteam.DAO;



import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.iteam.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long>{
	
List <Contact> findByNom(String nom);
	

}
