package com.rajbhavsar.foodordering.dao.impl;

import com.rajbhavsar.foodordering.dao.UserDao;
import com.rajbhavsar.foodordering.factory.ConnectionFactory;
import com.rajbhavsar.foodordering.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class UserDaoImpl implements UserDao
{

	private ConnectionFactory connectionFactory;

	public UserDaoImpl()
	{
		this.connectionFactory = new ConnectionFactory();
	}

	@Override
	public boolean insertUser(User user)
	{
		Connection connection = connectionFactory.getConnection();
		try
		{
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPhoneNumber());
			preparedStatement.setString(4,user.getAddress());
			preparedStatement.setString(5,user.getPassWord());

			int i = preparedStatement.executeUpdate();
			connection.close();
			if (i == 1)
			{
				return true;
			}
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateUser()
	{
		return false;
	}

	@Override
	public boolean deleteUser()
	{
		return false;
	}

	@Override
	public User getUser()
	{
		return null;
	}

	@Override
	public Set<User> getAllUsers()
	{
		return null;
	}

	@Override
	public User getUserByUserNameAndPassword()
	{
		return null;
	}
}
