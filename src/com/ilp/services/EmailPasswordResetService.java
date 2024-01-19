package com.ilp.services;

import com.ilp.entity.User;

//Service for resetting passwords through email
public class EmailPasswordResetService implements IPasswordResetService {
	@Override
	public void resetPassword(User user) {
		System.out.println("Password reset email sent to: " + user.getUsername());
	}
}
