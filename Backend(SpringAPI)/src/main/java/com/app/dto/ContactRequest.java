package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class ContactRequest {
	private String name;
    private String address;
    private Long mobileNumber;

	public ContactRequest() {}

	public ContactRequest(String name, String address, Long mobileNumber) {
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
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

	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber= mobileNumber;
	}

	@Override
	public String toString() {
		return "ContactRequest [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
}


// DTOs allow you to control what data is sent to the client and received from the client, providing a level of abstraction and flexibility.
// DTOs provides flexibility and control over the data exchanged in your API, ensuring a clear separation between the internal data representation and the API contract.
// It is used for getting customer details from client in controller class.
// This will be converted into JSON format by Spring Boot automatically when we send it as response.
// We can use this object directly without any conversion or mapping code because its already mapped with JSON format by Spring Boot.

// It is used for creating new customer
//In the CustomerRequestDTO, we include the fields name, address, and mobileNumber that are required for creating a new customer.
//wE can map the incoming request data to the CustomerRequestDTO object, validate it, and then transform it to the Customer entity before persisting it to the database