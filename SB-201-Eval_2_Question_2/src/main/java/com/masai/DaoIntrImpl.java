package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DaoIntrImpl implements DaoIntr {

	public void addCourse(Course course) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		em.close();

	}

	public void getStudent(int roll_no) throws StudentNotFoundException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Query query = em.createQuery("select s from Student s where s.rollNo = :roll");
		
		query.setParameter("roll", roll_no);
		
		List<Student> s = query.getResultList();
		
		System.out.println(s);
		
		em.getTransaction().commit();
		em.close();

	}

	public void getCourse(int course_id) throws CourseNotFoundException {

	}

}
