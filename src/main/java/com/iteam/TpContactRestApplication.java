package com.iteam;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iteam.DAO.ContactRepository;
import com.iteam.entities.Contact;




@SpringBootApplication
public class TpContactRestApplication implements CommandLineRunner {
	@Autowired 
	ContactRepository iContactRepository;
	public static void main(String[] args) {
		SpringApplication.run(TpContactRestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Contact c1 = iContactRepository.save(new Contact (1L,"Rahmouni","Malek",new Date(),"27272727"));
		Contact c2 = iContactRepository.save(new Contact (2L,"abc","def",new Date(),"1234568"));
		Contact c3 = iContactRepository.save(new Contact (3L,"Josef","Pierre",new Date(),"7555585"));
	}
}
