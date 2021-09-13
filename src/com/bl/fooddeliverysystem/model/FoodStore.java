package com.bl.fooddeliverysystem.model;

import java.util.ArrayList;
import java.util.List;

//this is data layer or model layer
public class FoodStore {

	private List<FoodItem> foodList = new ArrayList<FoodItem>(); // <> specifies the type of object to be stored

	private static FoodStore instance;

	private FoodStore() {

	}

	public static synchronized FoodStore getInstance() {
		if (instance == null) {
			instance = new FoodStore();
		}
		return instance;
	}

	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}

	public List<FoodItem> getFoodList() {
		return foodList;
	}

	public void remove(FoodItem foodItem) {
		foodList.remove(foodItem);
	}

	public FoodItem getFood(String foodName) {
		for (FoodItem foodItem : foodList) {
			if (foodName.equals(foodItem.itemName)) {
				return foodItem;
			}
		}
		return null;
	}

	public void setFooditem(List<FoodItem> fooditem) {
		this.foodList = fooditem;
	}
}
