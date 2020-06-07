package com.rajbhavsar.foodordering.DTO;

public class ItemDTO
{
	private int itemId;
	private String name;
	private String description;
	private Double price;

	public ItemDTO()
	{
	}

	public ItemDTO(final int itemId, final String name, final String description, final Double price)
	{
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getItemId()
	{
		return itemId;
	}

	public void setItemId(final int itemId)
	{
		this.itemId = itemId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(final Double price)
	{
		this.price = price;
	}
}
