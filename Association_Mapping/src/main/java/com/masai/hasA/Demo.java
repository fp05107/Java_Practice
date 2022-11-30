package com.masai.hasA;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
		// get all the Address of a Employee whose name is Ramesh
		String jpql = "from Employee where ename='Ramesh'";
		Query q = em.createQuery(jpql);
		List<Employee1> emps = q.getResultList();
		for (Employee1 emp : emps) {
			Set<Address> addrs = emp.getAddresses();
			for (Address adr : addrs) {
				System.out.println(adr);
			}
		}
		em.close();

	}

}
