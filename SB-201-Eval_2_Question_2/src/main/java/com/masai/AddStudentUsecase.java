package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddStudentUsecase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name : ");
		String name = sc.next();
		System.out.println("Enter Student Email: ");
		String email = sc.next();
		System.out.println("Enter student number");
		String number = sc.next();
		
		Student s = new Student();
		s.setEmail(email);
		s.setMobile(number);
		s.setName(name);
		s.setCourseId(null);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		
		
		
		em.getTransaction().begin();
		
		
	}

}
