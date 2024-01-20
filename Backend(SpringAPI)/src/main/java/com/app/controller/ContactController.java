// It handles incoming HTTP requests to the API endpoints. 

package com.app.controller;

import java.util.List;

import com.app.dto.ContactRequest;
import com.app.model.Contact;
import com.app.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/contact")
public class ContactController {
	@Autowired
    ContactService contactService;

	@PostMapping("/add")
    public ResponseEntity<Contact> addContact(@RequestBody ContactRequest contactRequestDTO) {
        Contact contact = contactService.addContact(contactRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(contact);
    }
    
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> removeContact(@PathVariable("id") Long contactId) {
        contactService.deleteContact(contactId);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Contact> updateContact(
            @PathVariable("id") Long contactId,
            @RequestBody ContactRequest contactRequestDTO
    ) {
        Contact contact = contactService.updateContact(contactId, contactRequestDTO);
        return ResponseEntity.ok(contact);
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContact();
        return ResponseEntity.ok(contacts);
    }
}