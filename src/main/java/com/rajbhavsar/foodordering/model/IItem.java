package com.rajbhavsar.foodordering.model;

public interface IItem
{
	int getId();

	void setId(final int id);

	String getName();

	void setName(final String name);

	int getItemCategory();

	void setItemCategory(final int itemCategory);

	String getDescription();

	void setDescription(final String description);

	double getCost();

	void setCost(final double cost);
}
