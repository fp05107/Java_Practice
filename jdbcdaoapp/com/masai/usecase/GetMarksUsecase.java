package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class GetMarksUsecase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		int m = dao.getMarksByRoll(roll);
		System.out.println(m);
		
	}
}
