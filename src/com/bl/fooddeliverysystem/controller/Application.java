package com.bl.fooddeliverysystem.controller;

import java.util.Scanner;

import com.bl.fooddeliverysystem.model.AppleJuice;
import com.bl.fooddeliverysystem.model.FoodItem;
import com.bl.fooddeliverysystem.model.FoodStore;
import com.bl.fooddeliverysystem.model.HakkaNoodle;
import com.bl.fooddeliverysystem.model.ItallianMomos;
import com.bl.fooddeliverysystem.model.MasalaDosa;
import com.bl.fooddeliverysystem.view.UserInterface;

//controller layer 
public class Application {

	FoodStore foodStore = new FoodStore();

	public static void main(String[] args) {
		/*
		 * AppleJuice appleJuice = new AppleJuice(); appleJuice.setPrice(100);
		 * 
		 * HakkaNoodle hakkaNoodle = new HakkaNoodle(); hakkaNoodle.setPrice(150);
		 * 
		 * ItallianMomos itallianMomos = new ItallianMomos();
		 * itallianMomos.setPrice(200);
		 * 
		 * MasalaDosa masalaDosa = new MasalaDosa(); masalaDosa.setPrice(80);
		 * 
		 * FoodStore foodstore = new FoodStore(); foodstore.add(appleJuice);
		 * foodstore.add(hakkaNoodle); foodstore.add(itallianMomos);
		 * foodstore.add(masalaDosa);
		 * 
		 * UserInterface userinterface = new UserInterface();
		 * userinterface.display(foodstore.getFoodList());
		 * 
		 * FoodStore.remove(appleJuice); FoodStore.remove(masalaDosa);
		 * System.out.println("After removing items);
		 * userinterface.display(foodstore.getFoodList());
		 */

		UserInterface userInterface = new UserInterface();
		userInterface.showUserMenu();
	}

	public void handleUserSelection(int n) {
		switch (n) {
		case 1:
			AppleJuice appleJuice = new AppleJuice();
			appleJuice.setPrice(150);

			HakkaNoodle hakkaNoodle = new HakkaNoodle();
			hakkaNoodle.setPrice(100);

			ItallianMomos itallianMomos = new ItallianMomos();
			itallianMomos.setPrice(200);

			MasalaDosa masalaDosa = new MasalaDosa();
			masalaDosa.setPrice(100);

			foodStore.add(appleJuice);
			foodStore.add(hakkaNoodle);
			foodStore.add(itallianMomos);
			foodStore.add(masalaDosa);

			UserInterface userInterface = new UserInterface();
			userInterface.display(foodStore.getFoodList());
			break;

		case 2:
			System.out.println("Enter name of food item to be removed");
			Scanner scan = new Scanner(System.in);
			String foodName = scan.nextLine();
			FoodItem foodItem = foodStore.getFood(foodName);
			foodStore.remove(foodItem);
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
	}

}
