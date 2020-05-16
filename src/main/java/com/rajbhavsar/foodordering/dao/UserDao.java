package com.rajbhavsar.foodordering.dao;

import com.rajbhavsar.foodordering.model.User;

import java.util.Set;

public interface UserDao
{
	boolean insertUser(User user);
	boolean updateUser();
	boolean deleteUser();
	User getUser();
	Set<User> getAllUsers();
	User getUserByUserNameAndPassword();
}
