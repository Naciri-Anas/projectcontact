//It contains business logic to store,retrieve,delete and update.
package com.app.service;

import com.app.dto.ContactRequest;
import com.app.model.Contact;

import com.app.repository.ContactRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository contactRepository;
    
    public Contact addContact(ContactRequest contactRequestDTO) {
        Contact contact = new Contact();
        contact.setName(contactRequestDTO.getName());
        contact.setAddress(contactRequestDTO.getAddress());
        contact.setMobile(contactRequestDTO.getMobileNumber());
        
        return contactRepository.save(contact);
    }
    
    public void deleteContact(Long contactId) {
        contactRepository.deleteById(contactId);
    }
    
    public Contact updateContact(Long contactId, ContactRequest contactRequestDTO) {
        Optional<Contact> optionalContact = contactRepository.findById(contactId);
        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            contact.setName(contactRequestDTO.getName());
            contact.setAddress(contactRequestDTO.getAddress());
            contact.setMobileNumber(contactRequestDTO.getMobileNumber());
            
            return contactRepository.save(contact);
        } else {
            throw new IllegalArgumentException("Contact not found with ID: " + contactId);
        }
    }
    
    public List<Contact> getAllContact() {
        return contactRepository.findAll();
    }
}

