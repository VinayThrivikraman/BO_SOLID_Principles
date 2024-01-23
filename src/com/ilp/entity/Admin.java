package com.ilp.entity;

import com.ilp.interfaces.IAdminServices;

public class Admin extends User implements IAdminServices{

	public Admin(String username, String password) {
		super(username, password);
	}
	
	public void deleteLanguage() {
		System.out.println();
	}
}
