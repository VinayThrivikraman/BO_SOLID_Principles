package com.ilp.services;

import com.ilp.interfaces.IUserService;
import com.ilp.entity.User;

public class SignupService implements IUserService {
	@Override
	public void performService(User user) {
		System.out.println("User registered: " + user.getUsername());
	}
}