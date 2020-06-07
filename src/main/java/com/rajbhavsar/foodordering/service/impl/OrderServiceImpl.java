package com.rajbhavsar.foodordering.service.impl;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.DTO.OrderDTO;
import com.rajbhavsar.foodordering.dao.OrderDao;
import com.rajbhavsar.foodordering.model.impl.Order;
import com.rajbhavsar.foodordering.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService
{
	private OrderDao orderDao;

	public OrderServiceImpl()
	{
		this.orderDao = new OrderDao();
	}

	@Override
	public OrderDTO createOrder(final List<ItemDTO> itemDTOList, final int userId)
	{
		Order order = new Order();

		order.setUserId(userId);

		Double totalAmount = calculateTotalAmount(itemDTOList);
		order.setTotalAmount(totalAmount);
		int orderId = orderDao.createOrder(order);

		//Need to do entry in order item map table

		List<Integer> itemIds = itemDTOList.stream().map(ItemDTO::getItemId).collect(Collectors.toList());

		orderDao.createEntriesIntoMappingTable(orderId, itemIds);
		return new OrderDTO(orderId, totalAmount);
	}

	private Double calculateTotalAmount(final List<ItemDTO> itemDTOList)
	{
		Double totalAmount = 0d;
		for (ItemDTO itemDTO : itemDTOList)
		{
			totalAmount += itemDTO.getPrice();
		}
		return totalAmount;
	}
}
