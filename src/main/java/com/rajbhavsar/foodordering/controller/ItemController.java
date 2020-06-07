package com.rajbhavsar.foodordering.controller;

import com.rajbhavsar.foodordering.DTO.ItemDTO;

import java.util.List;

public interface ItemController
{
	List<ItemDTO> fetchAllItems();
}
