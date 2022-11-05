package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;

public class GetStudentUsecase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		Student s = dao.getStudentByRoll(roll);
		if(s!=null) {
			
			System.out.println(s);
		}else {
			System.out.println("Student does not exist");
		}
	}
}
