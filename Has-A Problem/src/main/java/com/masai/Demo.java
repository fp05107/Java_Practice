package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = new Employee();
		emp.setEname("Ram");
		emp.setSalary(7800);
		emp.setHomeAddr(new Address("Maharastra", "pune", "75455"));
		emp.setOfficeAddr(new Address("Telengana", "hydrabad", "785422"));
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("done...");

	}

}
