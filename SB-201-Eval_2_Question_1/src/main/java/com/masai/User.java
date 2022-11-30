package com.masai;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name = "USERID")
	private int userId;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "EMAILID")
	private String emailid;
	
	private Set<PhoneNumber> set = new HashSet<PhoneNumber>();
	
	
	
	
	
}
