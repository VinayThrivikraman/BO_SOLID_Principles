package com.ilp.services;

import com.ilp.entity.User;

public class ForgetPasswordManager {
	private IPasswordResetService passwordResetService;

	public ForgetPasswordManager(IPasswordResetService passwordResetService) {
		this.passwordResetService = passwordResetService;
	}

	public void initiatePasswordReset(User user) {
		passwordResetService.resetPassword(user);
	}
}
