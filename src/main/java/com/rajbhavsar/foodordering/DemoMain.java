package com.rajbhavsar.foodordering;

import com.rajbhavsar.foodordering.controller.MainController;
import com.rajbhavsar.foodordering.controller.impl.MainControllerImpl;

public class DemoMain
{
	public static void main(String[] args)
	{
		System.out.println("Test setup");
		MainController mainController = new MainControllerImpl();
		mainController.showHomePage();
	}
}
