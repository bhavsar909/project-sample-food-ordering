package com.rajbhavsar.foodordering.service;

import com.rajbhavsar.foodordering.DTO.UserDTO;

public interface UserService
{
	boolean createUser(final String name, final String email, final String phoneNumber, final String address, final String password);
	UserDTO isValidUser(final String userName, String password);
}
