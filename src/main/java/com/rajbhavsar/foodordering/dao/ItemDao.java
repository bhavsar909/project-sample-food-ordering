package com.rajbhavsar.foodordering.dao;

import com.rajbhavsar.foodordering.model.impl.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ItemDao
{
	public List<Item> fetchItems()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project-sample-food-ordering");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();

		List<Item> items = entitymanager.createQuery("Select i from Item i", Item.class).getResultList();

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();
		return items;
	}
}
