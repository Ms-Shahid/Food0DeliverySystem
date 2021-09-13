package com.bl.fooddeliverysystem.model;

public class FoodItem {

	public enum Taste {
		SWEET, SALTY, SPICY, SOUR
	};

	public enum category {
		JUICES, STARTER, MAINCOURSE, DESERTS
	};

	public enum vegtype {
		VEG, NON_VEG
	};

	private Taste taste;
	public category category;
	private vegtype vegtype;
	private int price;
	public String itemName;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
		this.category = category;
	}

	public vegtype getVegtype() {
		return vegtype;
	}

	public void setVegtype(vegtype vegtype) {
		this.vegtype = vegtype;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + getTaste() + ", category=" + category + ", vegtype=" + vegtype + ", price=" + price
				+ ", itemName=" + itemName + "]";
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste string) {
		this.taste = string;
	}

}
