package com.masai.model;

import java.util.*;

import javax.persistence.*;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String emailid;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name = "phone",joinColumns = @JoinColumn(name = "userId"))
	private List<PhoneNumber> set = new ArrayList<PhoneNumber>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public List<PhoneNumber> getSet() {
		return set;
	}

	public void setSet(List<PhoneNumber> set) {
		this.set = set;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String emailid, List<PhoneNumber> set) {
		super();
		this.userName = userName;
		this.emailid = emailid;
		this.set = set;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailid=" + emailid + ", set=" + set + "]";
	}
	
	
	
	
	
}
