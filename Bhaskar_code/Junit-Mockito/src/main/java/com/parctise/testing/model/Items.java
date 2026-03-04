package com.parctise.testing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Items {

	@Id
	private int id;
	private String name;
	private int price;
	private int qunatity;

	@Transient
	private int value;
	
	Items(){
		
	}
	
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
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", qunatity=" + qunatity + ", value=" + value
				+ "]";
	}

	

}
