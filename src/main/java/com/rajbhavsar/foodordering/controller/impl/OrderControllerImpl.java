package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.DTO.OrderDTO;
import com.rajbhavsar.foodordering.controller.OrderController;
import com.rajbhavsar.foodordering.service.OrderService;
import com.rajbhavsar.foodordering.service.impl.OrderServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderControllerImpl implements OrderController
{
	private OrderService orderService;

	public OrderControllerImpl()
	{
		this.orderService = new OrderServiceImpl();
	}

	@Override
	public void createOrder(final Integer userId, final List<ItemDTO> itemDTOList, final List<Integer> itemIds)
	{
		OrderDTO orderDTO = orderService.createOrder(prepareItemDTOForOrder(itemDTOList, itemIds), userId);
		System.out.println("Amount to be paid: " + orderDTO.getTotalAmount());
		System.out.println("Order Created with Order Id: " + orderDTO.getOrderId());
	}

	private List<ItemDTO> prepareItemDTOForOrder(List<ItemDTO> itemDTOList, List<Integer> itemIds)
	{
		return itemDTOList.stream()
				.filter(itemDTO -> itemIds.contains(itemDTO.getItemId()))
				.collect(Collectors.toList());


/*
		List<ItemDTO> orderedItemDTOList = new ArrayList<>();
		for (ItemDTO itemDTO:itemDTOList){
			if (itemIds.contains(itemDTO.getItemId()))
				orderedItemDTOList.add(itemDTO);
		}
		return orderedItemDTOList;
*/

	}
}
