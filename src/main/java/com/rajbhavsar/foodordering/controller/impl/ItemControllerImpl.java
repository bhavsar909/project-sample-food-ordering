package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.controller.ItemController;
import com.rajbhavsar.foodordering.dao.ItemDao;
import com.rajbhavsar.foodordering.dao.impl.ItemDaoImpl;
import com.rajbhavsar.foodordering.model.Item;

public class ItemControllerImpl implements ItemController
{
	private ItemDao itemDao = new ItemDaoImpl();

	@Override
	public boolean createItem(final Item item)
	{
		return itemDao.createItem(item);
	}
}
