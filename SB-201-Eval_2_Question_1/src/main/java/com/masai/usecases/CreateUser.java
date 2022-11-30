package com.masai.usecases;

import com.masai.exception.UserNotFoundException;
import com.masai.model.PhoneNumber;
import com.masai.model.PhoneType;
import com.masai.model.User;
import com.masai.service.UserService;
import com.masai.service.UserServiceImpl;

public class CreateUser {
	public static void main(String[] args) {
		User user = new User();
		user.setUserName("Nrupul");
		user.setEmailid("Nrupul@masaischool.com");
		user.getSet().add(new PhoneNumber(1, "8908915959",PhoneType.HOME));
		user.getSet().add(new PhoneNumber(2, "8908915958",PhoneType.LANDLINE));
		user.getSet().add(new PhoneNumber(3, "8908915957",PhoneType.OFFICE));
		
		UserService dao = new UserServiceImpl();
		try {
			dao.createUser(user);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
