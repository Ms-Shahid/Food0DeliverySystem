package com.bl.fooddeliverysystem.model;

public class MasalaDosa extends FoodItem{

	public MasalaDosa() {
		setTaste(Taste.SOUR);
		setVegtype(vegtype.VEG);
		category = category.STARTER;
		itemName = "Masala Dosa";
	}
}
