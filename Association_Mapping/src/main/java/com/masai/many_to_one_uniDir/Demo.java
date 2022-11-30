package com.masai.many_to_one_uniDir;

import javax.persistence.*;

import com.masai.hasA.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();
		Address add1 = new Address();

		add1.setCity("BANGALORE");
		add1.setZipcode("560010");
		add1.setAid(1);
		Student stu1 = new Student();
		stu1.setSname("Manu");
		stu1.setAddress(add1);
		Student stu2 = new Student();
		stu2.setSname("Manjunath");
		stu2.setAddress(add1);
		Student stu3 = new Student();
		stu3.setSname("Advith");
		stu3.setAddress(add1);
		em.persist(stu1);
		em.persist(stu2);
		em.persist(stu3);
		// STUDENT CAN GET ADDRESS
		Student stu = em.find(Student.class, 1);
		System.out.println("student id is " + stu.getSid());
		System.out.println("student name is " + stu.getSname());
		System.out.println("student city is " + stu.getAddress().getCity());
		System.out.println("student zipcode is " + stu.getAddress().getZipcode());
		// ADDRESS CANNOT GET STUDENT
		/*
		 * Address add1 = em.find(Address.class, 1); System.out.println("address id is "
		 * + add1.getAid()); System.out.println("address city is " + add1.getCity());
		 * System.out.println("address zipcode is " + add1.getZipcode());
		 */
		em.getTransaction().commit();

	}

}
