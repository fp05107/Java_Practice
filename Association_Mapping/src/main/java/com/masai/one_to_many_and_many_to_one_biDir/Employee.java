package com.masai.one_to_many_and_many_to_one_biDir;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPID")
	private int empid;

	@Column(name = "ENAME")
	private String ename;

	@Column(name = "EMAIL")
	private String email;
	@ManyToOne
	@JoinColumn(name = "DEPTID")
	private Department department;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
