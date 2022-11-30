package com.masai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneNumber {

	@Id
	@Column(name = "PHONEID")
	private int phoneId;
	
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	
	@Column(name = "PHONETYPE")
    private PhoneType phoneType;
	
	
	private User user;
	
	
	
}
