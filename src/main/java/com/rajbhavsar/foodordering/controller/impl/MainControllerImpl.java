package com.rajbhavsar.foodordering.controller.impl;

import com.rajbhavsar.foodordering.DTO.ItemDTO;
import com.rajbhavsar.foodordering.DTO.UserDTO;
import com.rajbhavsar.foodordering.controller.ItemController;
import com.rajbhavsar.foodordering.controller.LoginController;
import com.rajbhavsar.foodordering.controller.MainController;
import com.rajbhavsar.foodordering.controller.OrderController;
import com.rajbhavsar.foodordering.controller.SignUpController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllerImpl implements MainController
{
	private SignUpController signUpController;
	private LoginController loginController;
	private ItemController itemController;
	private OrderController orderController;

	public MainControllerImpl()
	{
		this.signUpController = new SignUpControllerImpl();
		this.loginController = new LoginControllerImpl();
		this.itemController = new ItemControllerImpl();
		this.orderController = new OrderControllerImpl();
	}

	public void showHomePage()
	{
		System.out.println("Greetings");
		System.out.println("1.Login");
		System.out.println("2.SignUp");

		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		scanner.nextLine();
		switch (s)
		{
			case 1:
				System.out.println("Insert User Name(Email): ");
				String userName = scanner.nextLine();
				System.out.println("Insert Password: ");
				String password = scanner.nextLine();

				UserDTO userDTO = loginController.isAuthenticatedUser(userName, password);

				if (userDTO != null)
					this.showOrderPage(userDTO.getUserId(), userDTO.getUserName(), userDTO.getName());
				else
					this.showWrongUserNameOrPassWordPage(userName);
				break;
			case 2:
				System.out.println("Insert Name: ");
				String name = scanner.nextLine();
				System.out.println("Insert Email: ");
				String email = scanner.nextLine();
				System.out.println("Insert Phone Number: ");
				String phoneNumber = scanner.nextLine();
				System.out.println("Insert Address: ");
				String address = scanner.nextLine();
				System.out.println("Insert Password: ");
				String passwordT = scanner.nextLine();
				if (signUpController.registerUser(name, email, phoneNumber, address, passwordT))
					System.out.println("User Created!");
				break;
		}
	}

	private void showOrderPage(int userId, String userName, String name)
	{
		System.out.println("Hello " + name);
		System.out.println("Place Your Order");
		System.out.println("Select the Items:");

		List<ItemDTO> itemDTOList = showItems();
		List<Integer> itemIds = chooseItems();

		System.out.println("Place Your Order by Pressing 1:");
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		if (x == 1)
			orderController.createOrder(userId, itemDTOList, itemIds);
		else
			showItems();
	}

	private void showWrongUserNameOrPassWordPage(String userName)
	{
		System.out.println("User Name " + userName + " Or Password is incorrect");
		System.out.println("Try Again");
		showHomePage();
	}

	private List<ItemDTO> showItems()
	{
		List<ItemDTO> itemDTOList = itemController.fetchAllItems();

		for (ItemDTO itemDTO : itemDTOList)
		{
			System.out.println(itemDTO.getItemId() + " " + itemDTO.getName() + " "
					+ itemDTO.getDescription() + " " + itemDTO.getPrice());
		}

/*
		itemDTOList.forEach(itemDTO -> {
			System.out.println(itemDTO.getItemId() + " " + itemDTO.getName() + " "
					+ itemDTO.getDescription() + " " + itemDTO.getPrice());
		});
*/

		return itemDTOList;
	}

	private List<Integer> chooseItems()
	{
		List<Integer> itemIds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean addMore = true;
		while (addMore)
		{
			System.out.println("Select the Item: ");
			int s = scanner.nextInt();
			itemIds.add(s);
			System.out.println("Add more then Press 1 and for exit press any number:");
			int t = scanner.nextInt();
			if (t != 1)
				addMore = false;
		}
		return itemIds;
	}

}
