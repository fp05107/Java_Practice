package com.masai.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.exception.UserNotFoundException;
import com.masai.model.User;
import com.masai.utility.EMUtil;

public class UserServiceImpl implements UserService {

	public User createUser(User user) throws UserNotFoundException {

		EntityManager em = EMUtil.provideEntityManager();

		if (user == null)
			throw new UserNotFoundException("Please Provide Proper Details");
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();

		return user;
	}

	public List<User> findByName(String name) throws UserNotFoundException {
		EntityManager em = EMUtil.provideEntityManager();
		List<User> users = em.createQuery("from User where userName = '" + name + "'", User.class).getResultList();
		if(users.isEmpty()) throw new UserNotFoundException("Sorry no user with the name "+name+"found");
		return users;
	}

}
