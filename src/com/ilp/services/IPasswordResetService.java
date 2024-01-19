package com.ilp.services;

import com.ilp.entity.User;

public interface IPasswordResetService {
	void resetPassword(User user);
}
