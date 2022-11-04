package com.subham2;

import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student s1 = this;
		Student s2 = (Student) obj;
		
		return (s1.getRoll()==s2.getRoll()) && (s1.getMarks()==s2.getMarks()) && (s1.getName().equals(s2.getName()));
	}
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	public Student() {
		
	}
}
