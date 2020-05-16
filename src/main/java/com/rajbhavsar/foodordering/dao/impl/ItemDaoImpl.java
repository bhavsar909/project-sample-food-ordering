package com.rajbhavsar.foodordering.dao.impl;

import com.rajbhavsar.foodordering.dao.ItemDao;
import com.rajbhavsar.foodordering.factory.ConnectionFactory;
import com.rajbhavsar.foodordering.model.Item;
import com.rajbhavsar.foodordering.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemDaoImpl implements ItemDao
{
	private ConnectionFactory connectionFactory;

	public ItemDaoImpl()
	{
		this.connectionFactory = new ConnectionFactory();
	}

	@Override
	public boolean createItem(final Item item)
	{
		Connection connection = connectionFactory.getConnection();
		try
		{
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO item VALUES (NULL, ?, ?, ?, ?)");
			preparedStatement.setString(1, item.getName());
			preparedStatement.setString(2, item.getItemCategory());
			preparedStatement.setString(3, item.getDescription());
			preparedStatement.setDouble(4,item.getCost());

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
	public boolean updateItem()
	{
		return false;
	}

	@Override
	public boolean deleteItem()
	{
		return false;
	}
}
