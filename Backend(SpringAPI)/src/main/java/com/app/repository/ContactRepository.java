package com.app.repository;

import com.app.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
	//find customer by id
	Contact findById(long id);
}

// Repository Class  is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
// Before implementing the Repository class we have created a generic DemoRepository interface to provide the contact for our repository class to implement.