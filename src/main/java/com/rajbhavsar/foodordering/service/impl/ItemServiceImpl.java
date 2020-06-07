package com.rajbhavsar.foodordering.service.impl;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.dao.ItemDao;
import com.rajbhavsar.foodordering.model.impl.Item;
import com.rajbhavsar.foodordering.service.ItemService;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceImpl implements ItemService
{
	private ItemDao itemDao;

	public ItemServiceImpl()
	{
		this.itemDao = new ItemDao();
	}

	@Override
	public List<ItemDTO> fetchAllItems()
	{
		List<ItemDTO> itemDTOList = new ArrayList<>();

		List<Item> items = itemDao.fetchItems();

		for (Item item : items)
		{
			itemDTOList.add(new ItemDTO(item.getId(), item.getName(), item.getDescription(), item.getCost()));
		}
		return itemDTOList;
	}
}
