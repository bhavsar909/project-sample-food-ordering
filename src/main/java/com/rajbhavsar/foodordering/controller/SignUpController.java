package com.rajbhavsar.foodordering.controller;

public interface SignUpController
{
	boolean registerUser(final String name,final String email,final String phoneNumber, final String address, final String password);
}