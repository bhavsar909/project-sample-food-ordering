package com.rajbhavsar.foodordering.service;

import com.rajbhavsar.foodordering.DTO.ItemDTO;

import java.util.List;

public interface ItemService
{
	List<ItemDTO> fetchAllItems();
}
