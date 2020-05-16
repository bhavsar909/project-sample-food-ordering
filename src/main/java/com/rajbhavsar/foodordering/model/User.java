package com.rajbhavsar.foodordering.model;

public class User
{
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String passWord;

	public User()
	{
	}

	public User(final String name, final String email, final String phoneNumber, final String address, final String passWord)
	{
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.passWord = passWord;
	}

	public User(final int id, final String name, final String email, final String phoneNumber, final String address, final String passWord)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.passWord = passWord;
	}

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(final String address)
	{
		this.address = address;
	}

	public String getPassWord()
	{
		return passWord;
	}

	public void setPassWord(final String passWord)
	{
		this.passWord = passWord;
	}

	@Override
	public String toString()
	{
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", address='" + address + '\'' +
				", passWord='" + passWord + '\'' +
				'}';
	}
}
