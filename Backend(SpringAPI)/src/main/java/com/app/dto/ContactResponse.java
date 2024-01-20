package com.app.dto;

import com.app.model.Contact;
import org.springframework.stereotype.Component;




@Component
public class ContactResponse {
private Contact contact;
private String status;

public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "ContactResponse [status=" + status + "]";
}

}
