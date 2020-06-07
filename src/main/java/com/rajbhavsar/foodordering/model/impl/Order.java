package com.rajbhavsar.foodordering.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "total_amount")
	private Double totalAmount;

	public Order()
	{
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(final Integer id)
	{
		this.id = id;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(final Integer userId)
	{
		this.userId = userId;
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
