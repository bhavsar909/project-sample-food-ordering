package com.rajbhavsar.foodordering.dao;

import com.rajbhavsar.foodordering.model.Item;
import com.rajbhavsar.foodordering.model.User;

import java.util.Set;

public interface ItemDao
{
	boolean createItem(Item item);
	boolean updateItem();
	boolean deleteItem();
	/*User getUser();
	Set<Item> getAllUsers();
	User getUserByUserNameAndPassword();*/
}
