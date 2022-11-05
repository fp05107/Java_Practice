package com.masai.dao;

import com.masai.model.Student;

public interface StudentDao {

	public String insertStudentDetails(int roll,String name,int marks);
	public String insertStudentDetails2(Student student);
	public int getMarksByRoll(int roll);
	public Student getStudentByRoll(int roll);
	
	
	
}
