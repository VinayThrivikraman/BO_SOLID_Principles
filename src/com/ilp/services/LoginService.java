package com.ilp.services;

import com.ilp.entity.User;
import com.ilp.interfaces.IUserService;

public class LoginService implements IUserService {
	@Override
	public void performService(User user) {
		System.out.println("User logged in: " + user.getUsername());
	}
}