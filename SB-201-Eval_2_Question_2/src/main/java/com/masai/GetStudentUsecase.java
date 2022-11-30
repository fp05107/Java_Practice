package com.masai;

import java.util.Scanner;

public class GetStudentUsecase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll no");
		
		int roll_no = sc.nextInt();
		
		DaoIntr dao = new DaoIntrImpl();
		
		try {
			dao.getStudent(roll_no);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
