package com.ilp.utility;

import com.ilp.entity.Player;
import com.ilp.entity.User;
import com.ilp.services.*;

//Main class to demonstrate the usage
public class MainUtility {
 public static void main(String[] args) {
     User user = new Player("john_doe", "password123", 0, 500, "German");

     SignupService signupService = new SignupService();
     signupService.performService(user);

     LoginService loginService = new LoginService();
     loginService.performService(user);

     IPasswordResetService emailPasswordResetService = new EmailPasswordResetService();
     IPasswordResetService textMessagePasswordResetService = new TextMessagePasswordResetService();

     ForgetPasswordManager forgetPasswordWithEmail = new ForgetPasswordManager(emailPasswordResetService);
     forgetPasswordWithEmail.initiatePasswordReset(user);

     ForgetPasswordManager forgetPasswordWithTextMessage = new ForgetPasswordManager(textMessagePasswordResetService);
     forgetPasswordWithTextMessage.initiatePasswordReset(user);
 }
}