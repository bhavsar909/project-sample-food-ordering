package com.rajbhavsar.foodordering.service;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.DTO.OrderDTO;

import java.util.List;

public interface OrderService
{
	OrderDTO createOrder(List<ItemDTO> itemDTOList, final int userId);
}
