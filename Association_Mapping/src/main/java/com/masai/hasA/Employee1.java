package com.masai.hasA;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	@ElementCollection
	@Embedded
	@JoinTable(name = "empaddress", joinColumns = @JoinColumn(name = "emp_id"))
	private Set<Address> addresses = new HashSet<Address>();
	
	public Employee1() {
		super();
	}

	public Employee1(String ename, int salary, Set<Address> addresses) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.addresses = addresses;
	}

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

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	
	
}
