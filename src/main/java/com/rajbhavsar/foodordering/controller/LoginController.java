package com.rajbhavsar.foodordering.controller;

import com.rajbhavsar.foodordering.DTO.UserDTO;

public interface LoginController
{
	UserDTO isAuthenticatedUser(String userName, String password);
}
