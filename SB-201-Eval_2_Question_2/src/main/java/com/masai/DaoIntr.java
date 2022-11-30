package com.masai;

public interface DaoIntr {

	public void addCourse(Course course);
	
	public void getStudent(int roll_no) throws StudentNotFoundException;
	
	public void getCourse(int course_id) throws CourseNotFoundException;
	
	
}
