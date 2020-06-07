package com.rajbhavsar.foodordering.DTO;

public class OrderDTO
{
	private int orderId;
	private Double totalAmount;

	public OrderDTO()
	{
	}

	public OrderDTO(final int orderId, final Double totalAmount)
	{
		this.orderId = orderId;
		this.totalAmount = totalAmount;
	}

	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(final int orderId)
	{
		this.orderId = orderId;
	}

	public Double getTotalAmount()
	{
		return totalAmount;
	}

	public void setTotalAmount(final Double totalAmount)
	{
		this.totalAmount = totalAmount;
	}
}
