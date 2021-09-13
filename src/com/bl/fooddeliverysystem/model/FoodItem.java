package com.bl.fooddeliverysystem.model;

public class FoodItem {

	enum Taste {
		SWEET, SALTY, SPICY, SOUR
	};

	enum category {
		JUICES, STARTER, MAINCOURSE, DESERTS
	};

	enum vegtype {
		VEG, NON_VEG
	};

	protected Taste taste;
	protected category category;
	protected vegtype vegtype;
	private int price;
	protected String itemName;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", category=" + category + ", vegtype=" + vegtype + ", price=" + price
				+ ", itemName=" + itemName + "]";
	}

}
