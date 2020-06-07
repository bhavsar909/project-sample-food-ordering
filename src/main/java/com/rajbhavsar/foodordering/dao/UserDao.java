package com.rajbhavsar.foodordering.dao;

import com.rajbhavsar.foodordering.model.impl.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDao
{
	public void insertUser(User user)
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project-sample-food-ordering");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();

		entitymanager.persist(user);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();
	}

	public List<User> fetchValidUser(String email, String password)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project-sample-food-ordering");

		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		entitymanager.getTransaction().begin();

		List<User> users = entitymanager.createQuery("Select u from User u where u.email=?1  and u.password=?2", User.class).setParameter(1, email)
				.setParameter(2, password).getResultList();

		entitymanager.getTransaction().commit();

		entitymanager.close();
		entityManagerFactory.close();
		return users;
	}

}
