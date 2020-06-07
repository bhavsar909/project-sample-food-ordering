package com.rajbhavsar.foodordering.dao;

import com.rajbhavsar.foodordering.model.impl.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class OrderDao
{
	public Integer createOrder(Order order)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project-sample-food-ordering");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();

		Query query = entitymanager.createNativeQuery("INSERT INTO `Order` (user_id, total_amount) VALUES (:userId , :totalAmount);");
		query.setParameter("userId", order.getUserId());
		query.setParameter("totalAmount", order.getTotalAmount());
		int id = query.executeUpdate();

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();

		return id;
	}

	public void createEntriesIntoMappingTable(final Integer orderId, final List<Integer> itemIds)
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project-sample-food-ordering");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();

		for (Integer itemId : itemIds)
		{
			Query query = entitymanager.createNativeQuery("INSERT INTO OrderItemMap (order_id, item_id) VALUES (:orderId , :itemId);");
			query.setParameter("orderId", orderId);
			query.setParameter("itemId", itemId);
			query.executeUpdate();
		}

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();

	}
}
