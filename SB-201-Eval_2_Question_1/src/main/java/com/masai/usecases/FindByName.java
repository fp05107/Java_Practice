package com.masai.usecases;

import java.util.function.Consumer;

import com.masai.exception.UserNotFoundException;
import com.masai.model.User;
import com.masai.service.UserService;
import com.masai.service.UserServiceImpl;

public class FindByName {
	
	public static void main(String[] args) {
		UserService dao = new UserServiceImpl();
		
		try {
			dao.findByName("Albert").forEach(new Consumer<User>() {
				public void accept(User e) {
					System.out.println(e);
				}
			});
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
