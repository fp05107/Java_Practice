package com.masai;

import java.util.Scanner;

public class AddCourseUsecase {

	public static void main(String[] args) {

		Student student;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter course name : ");
		String courseName = sc.next();
		System.out.println("Enter duration: ");
		String duration = sc.next();
		System.out.println("Enter course fee: ");
		int fee = sc.nextInt();
		System.out.println("");
		System.out.println("Enter student name");
		String sName = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter Mobile");
		String mobile = sc.next();

		Course c = new Course();
		c.setCourseName(sName);
		c.setDuration(duration);
		c.setFee(fee);

		Student s = new Student();
		s.setEmail(email);
		s.setMobile(mobile);
		s.setName(sName);
		s.setCourseId(c);
		c.getStudents().add(s);

		DaoIntr dao = new DaoIntrImpl();
		
		dao.addCourse(c);

	}

}
