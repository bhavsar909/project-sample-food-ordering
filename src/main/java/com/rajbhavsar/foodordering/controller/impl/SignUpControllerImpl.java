package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.controller.SignUpController;
import com.rajbhavsar.foodordering.service.UserService;
import com.rajbhavsar.foodordering.service.impl.UserServiceImpl;

public class SignUpControllerImpl implements SignUpController
{
	private UserService userService;

	public SignUpControllerImpl()
	{
		this.userService = new UserServiceImpl();
	}

	public boolean registerUser(final String name, final String email, final String phoneNumber, final String address, final String password)
	{
		return userService.createUser(name, email, phoneNumber, address, password);
	}
}
