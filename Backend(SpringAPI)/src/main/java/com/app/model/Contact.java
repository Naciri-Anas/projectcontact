package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//a class can be mapped to a table.
@Entity
public class Contact {
//primary key of current entity
@Id

//specify how the primary key should be generated
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String name;
private String address;
private Long mobile;

// Constructor
public Contact() {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.mobile = mobile;

}



	// getters and setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}

// toString method to print all customer details in a single line
@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
}


	public void setMobileNumber(Long mobileNumber) {
	//this is a set method so it can be used in the contact service

	}
}

// It is used to represent a customer entity.
// It contains all the information about the customer.
// It is a fully encapsulated class.
// It contains only fields and methods to set and retrieve data.