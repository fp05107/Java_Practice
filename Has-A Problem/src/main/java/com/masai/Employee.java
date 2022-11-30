package com.masai;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
	})
	
	private Address homeAddr;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
	@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
	@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
	})
	private Address officeAddr;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getOfficeAddr() {
		return officeAddr;
	}

	public void setOfficeAddr(Address officeAddr) {
		this.officeAddr = officeAddr;
	}

	

	
	
	
}
