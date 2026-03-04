package com.parctise.testing.model;

public class Items {

	private int id;
	private String name;
	private int price;
	private int qunatity;

	public Items(int id, String name, int price, int qunatity) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.qunatity = qunatity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", qunatity=" + qunatity + "]";
	}

}
