package com.ilp.services;

import com.ilp.entity.User;

public class TextMessagePasswordResetService implements IPasswordResetService {
 @Override
 public void resetPassword(User user) {
     System.out.println("Password reset text message sent to: " + user.getUsername());
 }
}
