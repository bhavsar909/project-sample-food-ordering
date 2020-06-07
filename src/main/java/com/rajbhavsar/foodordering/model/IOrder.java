package com.rajbhavsar.foodordering.model;

public interface IOrder
{
	Integer getId();

	void setId(final Integer id);

	Integer getUserId();

	void setUserId(final Integer userId);

	Double getTotalAmount();

	void setTotalAmount(final Double totalAmount);

}
