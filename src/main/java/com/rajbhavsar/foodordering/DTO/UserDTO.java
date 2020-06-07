package com.rajbhavsar.foodordering.DTO;

public class UserDTO
{
	private int userId;
	private String userName;
	private String name;

	public UserDTO()
	{
	}

	public UserDTO(final int userId, final String userName,String name)
	{
		this.userId = userId;
		this.userName = userName;
		this.name = name;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(final int userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(final String userName)
	{
		this.userName = userName;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
}
