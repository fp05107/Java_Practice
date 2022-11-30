package com.masai.service;

import java.util.List;

import com.masai.exception.UserNotFoundException;
import com.masai.model.User;

public interface UserService {
	
	public User createUser(User user) throws UserNotFoundException;
	
	public List<User> findByName(String name) throws UserNotFoundException;
	
	
}
