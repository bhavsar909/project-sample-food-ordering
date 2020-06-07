package com.rajbhavsar.foodordering.controller;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.DTO.OrderDTO;

import java.util.List;

public interface OrderController
{
	void createOrder(final Integer userIds, final List<ItemDTO> itemDTOList, final List<Integer> itemIds);
}
