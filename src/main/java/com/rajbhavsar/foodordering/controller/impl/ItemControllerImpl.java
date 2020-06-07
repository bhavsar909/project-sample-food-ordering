package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.controller.ItemController;
import com.rajbhavsar.foodordering.service.ItemService;
import com.rajbhavsar.foodordering.service.impl.ItemServiceImpl;

import java.util.List;

public class ItemControllerImpl implements ItemController
{
	private ItemService itemService;

	public ItemControllerImpl()
	{
		this.itemService = new ItemServiceImpl();
	}

	@Override
	public List<ItemDTO> fetchAllItems()
	{
		return itemService.fetchAllItems();
	}
}
