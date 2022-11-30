package com.masai.model;

import javax.persistence.*;

public class PhoneNumber {

	private int phoneId;
	private String phoneNumber;
	@Enumerated
    private PhoneType phoneType;
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	public PhoneNumber(int phoneId, String phoneNumber, PhoneType phoneType) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}
	
	
	
	
	
}
