package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.controller.UserController;
import com.rajbhavsar.foodordering.dao.UserDao;
import com.rajbhavsar.foodordering.dao.impl.UserDaoImpl;
import com.rajbhavsar.foodordering.model.User;

public class UserControllerImpl implements UserController
{
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean registerUser(User user)
	{
		return userDao.insertUser(user);
	}
}
