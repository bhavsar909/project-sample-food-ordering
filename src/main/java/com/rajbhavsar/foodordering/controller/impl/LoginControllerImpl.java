package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.DTO.UserDTO;
import com.rajbhavsar.foodordering.controller.LoginController;
import com.rajbhavsar.foodordering.service.UserService;
import com.rajbhavsar.foodordering.service.impl.UserServiceImpl;

public class LoginControllerImpl implements LoginController
{
	private UserService userService;

	public LoginControllerImpl()
	{
		this.userService = new UserServiceImpl();
	}

	@Override
	public UserDTO isAuthenticatedUser(final String userName, final String password)
	{
		return userService.isValidUser(userName,password);
	}
}
