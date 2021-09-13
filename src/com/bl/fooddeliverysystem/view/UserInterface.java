package com.bl.fooddeliverysystem.view;

import java.util.List;
import java.util.Scanner;

import com.bl.fooddeliverysystem.controller.Application;
import com.bl.fooddeliverysystem.model.FoodItem;
import com.bl.fooddeliverysystem.model.FoodItem.Taste;
import com.bl.fooddeliverysystem.model.FoodItem.category;
import com.bl.fooddeliverysystem.model.FoodItem.vegtype;

//view layer
public class UserInterface {

	public void display(List<FoodItem> foodList) {

		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}

	public FoodItem addFoodItems() {
		FoodItem foodItem = new FoodItem();
		System.out.println("Enter the food items to be added: ");
		Scanner scan = new Scanner(System.in);
		foodItem.itemName = scan.nextLine();

		System.out.println("Enter \n 0:SWEET \n 1:SALTY \n 2:SPICY \n 3:SOUR ");
		int choice1 = scan.nextInt();
		switch (choice1) {
		case 0:
			foodItem.setTaste(Taste.SWEET);
		case 1:
			foodItem.setTaste(Taste.SALTY);
		case 2:
			foodItem.setTaste(Taste.SPICY);
		default:
			foodItem.setTaste(Taste.SOUR);
		}

		System.out.println("Enter \n 0:VEG \n 1:NON_VEG");
		int choice2 = scan.nextInt();
		if (choice2 == 0)
			foodItem.setVegtype(vegtype.VEG);
		else
			foodItem.setVegtype(vegtype.NON_VEG);

		System.out.println("Enter \n 0:JUICES \n 1:STARTER \n 2:MAINCOURSE \n 3:DESERTS");
		int choice3 = scan.nextInt();
		switch (choice3) {
		case 0:
			foodItem.setCategory(category.JUICES);
		case 1:
			foodItem.setCategory(category.STARTER);
		case 2:
			foodItem.setCategory(category.MAINCOURSE);
		case 3:
			foodItem.setCategory(category.DESERTS);
		}

		System.out.println("Enter the price: ");
		int choice4 = scan.nextInt();
		foodItem.setPrice(choice4);
		return foodItem;
	}

	public void showUserMenu() {

		Scanner scan = new Scanner(System.in);
		int n = 0;
		int exit = 4;

		Application application = new Application();

		while (n != exit) {
			System.out.println("Enter 1 for Adding food item");
			System.out.println("Enter 2 for removing food item");
			System.out.println("Enter 3 for printing food item");
			System.out.println("Enter " + exit + " for exit");

			n = scan.nextInt();

			application.handleUserSelection(n);
		}
	}
}
