//    package com.app.service;
//
//    import com.app.dto.ContactRequest;
//    import com.app.dto.controller.ContactController;
//    import com.app.model.Contact;
//    import com.app.repository.ContactRepository;
//    import org.junit.jupiter.api.Test;
//    import org.junit.jupiter.api.extension.ExtendWith;
//    import org.mockito.InjectMocks;
//    import org.mockito.Mock;
//    import org.mockito.Mockito;
//    import org.springframework.boot.test.context.SpringBootTest;
//    import org.springframework.http.HttpStatus;
//    import org.springframework.http.ResponseEntity;
//    import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//
//    import java.util.Arrays;
//    import java.util.List;
//    import java.util.Optional;
//
//    import static org.junit.jupiter.api.Assertions.*;
//    import static org.mockito.ArgumentMatchers.any;  // Add this import
//    import static org.mockito.Mockito.*;
//
//    @SpringBootTest
//    @ExtendWith(SpringExtension.class)
//    class ContactServiceTest {
//
//        @Mock
//        private ContactRepository contactRepository;
//
//        @InjectMocks
//        private ContactService contactService;
//
//
//
//        @Test
//        //This test checks that when you create a Contact using the default constructor, the fields are set to null or default values
//
//        void testDefaultConstructor() {
//            // Arrange
//            Contact contact = new Contact();
//
//            // Assert
//            assertNull(contact.getId());
//            assertNull(contact.getName());
//            assertNull(contact.getAddress());
//            assertNull(contact.getMobile());
//        }
//        @Test
//         void testAddContact() {
//            // Arrange
//            ContactRequest contactRequest = new ContactRequest("test", "12dd", 1234567890L);
//            Contact expectedContact = new Contact();
//            expectedContact.setId(1L);
//            expectedContact.setName("test");
//            expectedContact.setAddress("12dd");
//            expectedContact.setMobile(1234567890L);
//
//            when(contactRepository.save(any())).thenReturn(expectedContact);
//
//            // Act
//            Contact result = contactService.addContact(contactRequest);
//
//            // Assert
//            assertNotNull(result);
//            assertEquals(expectedContact.getId(), result.getId());
//            assertEquals(expectedContact.getName(), result.getName());
//            assertEquals(expectedContact.getAddress(), result.getAddress());
//            assertEquals(expectedContact.getMobile(), result.getMobile());
//        }
//
//        @Test
//         void testDeleteContact() {
//            // Arrange
//            Long contactId = 1L;
//
//            // Act
//            contactService.deleteContact(contactId);
//
//            // Assert
//            verify(contactRepository, times(1)).deleteById(contactId);
//        }
//        @Test
//        void testContactProperties() {
//            // Arrange
//            Long id = 1L;
//            String name = "mjid";
//            String address = "1mmk";
//            Long mobile = 1234567890L;
//
//            // Act
//            Contact contact = new Contact();
//            contact.setId(id);
//            contact.setName(name);
//            contact.setAddress(address);
//            contact.setMobile(mobile);
//
//            // Assert
//            assertEquals(id, contact.getId());
//            assertEquals(name, contact.getName());
//            assertEquals(address, contact.getAddress());
//            assertEquals(mobile, contact.getMobile());
//        }
//
//        @Test
//        void testUpdateContact() {
//            // Arrange
//            Long contactId = 1L;
//            ContactRequest contactRequest = new ContactRequest("UpdatedName", "UpdatedAddress", 9876543210L);
//
//            Contact existingContact = new Contact();
//            existingContact.setId(contactId);
//            existingContact.setName("OriginalName");
//            existingContact.setAddress("OriginalAddress");
//            existingContact.setMobile(1234567890L);
//
//            when(contactRepository.findById(contactId)).thenReturn(Optional.of(existingContact));
//            when(contactRepository.save(any())).thenReturn(existingContact);
//
//            // Act
//            Contact updatedContact = contactService.updateContact(contactId, contactRequest);
//
//            // Assert
//            assertNotNull(updatedContact);
//            assertEquals(contactId, updatedContact.getId());
//            assertEquals(contactRequest.getName(), updatedContact.getName());
//            assertEquals(contactRequest.getAddress(), updatedContact.getAddress());
//            // Verify that findById and save methods were called
//            verify(contactRepository, times(1)).findById(contactId);
//            verify(contactRepository, times(1)).save(existingContact);
//        }
//
//
//
//
//
//
//    }
