package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;


public class InsertStudent2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		
//		StudentDaoImpl dao = new StudentDaoImpl();
		StudentDao dao = new StudentDaoImpl();
		
		Student student = new Student(roll, name, marks);
		String s = dao.insertStudentDetails2(student);
		
		System.out.println(s);
	}
}
