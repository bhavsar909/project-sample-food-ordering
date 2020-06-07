package com.rajbhavsar.foodordering.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@Column(name = "item_category")
	private int itemCategory;

	private String description;

	private double cost;

	public Item()
	{
	}

	public Item(final String name, final int itemCategory, final String description, final double cost)
	{
		this.name = name;
		this.itemCategory = itemCategory;
		this.description = description;
		this.cost = cost;
	}

	public Item(final int id, final String name, final int itemCategory, final String description, final double cost)
	{
		this.id = id;
		this.name = name;
		this.itemCategory = itemCategory;
		this.description = description;
		this.cost = cost;
	}

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public int getItemCategory()
	{
		return itemCategory;
	}

	public void setItemCategory(final int itemCategory)
	{
		this.itemCategory = itemCategory;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(final double cost)
	{
		this.cost = cost;
	}

	@Override
	public String toString()
	{
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +
				", itemCategory='" + itemCategory + '\'' +
				", description='" + description + '\'' +
				", cost=" + cost +
				'}';
	}
}
