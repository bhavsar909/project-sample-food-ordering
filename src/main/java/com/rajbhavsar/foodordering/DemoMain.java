package com.rajbhavsar.foodordering;

import com.rajbhavsar.foodordering.controller.ItemController;
import com.rajbhavsar.foodordering.controller.UserController;
import com.rajbhavsar.foodordering.controller.impl.ItemControllerImpl;
import com.rajbhavsar.foodordering.controller.impl.UserControllerImpl;
import com.rajbhavsar.foodordering.model.Item;
import com.rajbhavsar.foodordering.model.User;

public class DemoMain
{
	public static void main(String[] args)
	{
		UserController userController= new UserControllerImpl();
		User user = new User("Rohan","rohan@gmail.com","42352323","fwfwe","fef123");
		System.out.println(userController.registerUser(user));

		ItemController itemController= new ItemControllerImpl();
		Item item = new Item("Paneer Butter masala","Panjabi","It contains paneer with Onion and tomato base Gravy",150d);
		System.out.println(itemController.createItem(item));
	}
}
