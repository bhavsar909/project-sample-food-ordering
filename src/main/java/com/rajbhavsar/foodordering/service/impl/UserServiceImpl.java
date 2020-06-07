package com.rajbhavsar.foodordering.service.impl;

import com.rajbhavsar.foodordering.DTO.UserDTO;
import com.rajbhavsar.foodordering.dao.UserDao;
import com.rajbhavsar.foodordering.model.impl.User;
import com.rajbhavsar.foodordering.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{
	private UserDao userDao;

	public UserServiceImpl()
	{
		this.userDao = new UserDao();
	}

	public boolean createUser(final String name, final String email, final String phoneNumber, final String address, final String password)
	{
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhoneNumber(phoneNumber);
		user.setAddress(address);
		user.setPassword(password);

		userDao.insertUser(user);
		return true;
	}

	@Override
	public UserDTO isValidUser(final String userName, final String password)
	{
		List<User> users = userDao.fetchValidUser(userName,password);
		if (users.isEmpty())
			return null;
		else
			return new UserDTO(users.get(0).getId(),users.get(0).getEmail(),users.get(0).getName());
	}
}
